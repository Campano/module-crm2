package com.simplicite.objects.Crm;

import java.util.*;

import com.simplicite.util.*;
import com.simplicite.util.exceptions.*;
import com.simplicite.util.tools.*;

/**
 * Business object CrmActivity
 */
public class CrmActivity extends ObjectDB {
	private static final long serialVersionUID = 1L;
	
	@Override
	public List<String> preValidate() {
		List<String> msgs = new ArrayList<>();
		ObjectField f = getField("crmActId");
		if (isNew()||isCopied())
			f.setValue(getGrant().getNextIdForColumn(getTable(),f.getDBName()));

		return msgs;
	}
}
