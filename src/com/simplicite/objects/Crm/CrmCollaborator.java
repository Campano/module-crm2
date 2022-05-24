package com.simplicite.objects.Crm;

import java.util.*;
import com.simplicite.util.*;
import com.simplicite.util.tools.*;

/**
 * Business object CrmCollaborator
 */
public class CrmCollaborator extends com.simplicite.objects.System.SimpleUser {
	private static final long serialVersionUID = 1L;

	@Override
	public void postLoad() {
		super.postLoad();

		// hidding useless fields in field area
		ObjectField f = getField("mdl_name");
		f.setVisibility(ObjectField.VIS_NOT);

		f = getField("viw_name");
		f.setVisibility(ObjectField.VIS_NOT);
	}
	
	@Override
	public String postSave() {
		super.postSave();
		Grant g = getGrant();
		if (g.hasResponsibility("CRM_ADMIN") || g.hasResponsibility("ADMIN")) {
			Grant.addResponsibility(getRowId(), "CRM_GROUP");
		}

		return null;
	}

}