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
		Grant g = getGrant();
		ObjectDB o = g.getTmpObject("CrmOpportunity");
		String accId = o.getFieldValue("crmOppLeadId.crmLeadAccId");
		ObjectField f = getField("crmOppAccId.crmAccName");
		String name = getFieldValue("crmOppLeadId.crmLeadAccId.crmAccName");
	}
}
