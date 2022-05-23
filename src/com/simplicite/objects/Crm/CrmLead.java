package com.simplicite.objects.Crm;

import java.util.*;

import com.simplicite.util.*;
import com.simplicite.util.exceptions.*;
import com.simplicite.util.tools.*;

/**
 * Business object CrmLead
 */
public class CrmLead extends ObjectDB {
	private static final long serialVersionUID = 1L;
	
	// todo, synchronize ? 
	@Override
	public List<String> preValidate() {

		List<String> msgs = new ArrayList<>();
		ObjectField f = getField("crmLeadId");
		if (isNew()||isCopied())
			f.setValue(getGrant().getNextIdForColumn(getTable(), f.getDBName()));

		return msgs;
	}

}