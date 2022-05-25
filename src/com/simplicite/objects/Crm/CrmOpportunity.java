package com.simplicite.objects.Crm;

import java.util.*;

import com.simplicite.util.*;
import com.simplicite.util.exceptions.*;
import com.simplicite.util.tools.*;

/**
 * Business object CrmOpportunity
 */
public class CrmOpportunity extends ObjectDB {
	private static final long serialVersionUID = 1L;

	@Override
	public void initCreate() {
		ObjectField field = getField("crmLeadAccId");
		String test = field.getValue();
		Grant g = getGrant();

	}
}
