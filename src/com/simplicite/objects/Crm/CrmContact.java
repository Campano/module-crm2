package com.simplicite.objects.Crm;

import java.util.*;

import com.simplicite.util.*;
import com.simplicite.util.exceptions.*;
import com.simplicite.util.tools.*;

/**
 * Business object CrmLead
 */
public class CrmContact extends ObjectDB {
	private static final long serialVersionUID = 1L;

	// reset filter when the ref object is not CrmLead
	// not working
	@Override
	public void initRefSelect(ObjectDB parent) {
		if(parent == null) return;
		String name = parent.getName();
		if(name != "CrmLead") {
			ObjectDB o = getGrant().getTmpObject("CrmContact");
			o.resetFilters();
		}
	}
}
