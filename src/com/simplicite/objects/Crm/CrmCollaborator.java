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
		
		final String moduleId = ModuleDB.getModuleId("CrmUser");

		// default module value
		ObjectField f = getField("row_module_id");
		f.setDefaultValue(moduleId);

		// hidding useless fields in field area
		f = getField("mdl_name");
		f.setVisibility(ObjectField.VIS_NOT);

		f = getField("viw_name");
		f.setVisibility(ObjectField.VIS_NOT);
	}
}
