package com.simplicite.objects.Crm;

import java.util.*;

import com.simplicite.util.*;
import com.simplicite.util.exceptions.*;
import com.simplicite.util.tools.*;

/**
 * Business object CrmContact
 */
public class CrmContact extends ObjectDB {
	private static final long serialVersionUID = 1L;
	
	@Override
	public List<String> preValidate() {
		ObjectField f = getField("crmCtcNumber");
		if (isNew() || isCopied())
			f.setValue(getGrant().getNextIdForColumn(getTable(),f.getDBName()));
		return null;
	}

	@Override
	public void initCreate() {
		setFieldValue("crmCtcNumber", "0");
	}
}
