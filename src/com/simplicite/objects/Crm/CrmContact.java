package com.simplicite.objects.Crm;

import java.util.*;

import com.simplicite.util.*;
import com.simplicite.util.exceptions.*;
import com.simplicite.util.tools.*;

/** test multiple
 * Business object CrmContact
 */  
public class CrmContact extends ObjectDB {
	private static final long serialVersionUID = 1L;
	

	/*@Override
	public void initRefSelect(ObjectDB parent) {
		try {
			String name = parent.getName();
			String testValue = "CrmLead";
			
			String filter = "";
			String accId = parent.getFieldValue("crmLeadAccId");
			if(accId != "") {
				filter = "AND exists (SELECT * FROM crm_lead where t.row_id = " + accId + ")";
			}
			setSearchSpec(getDefaultSearchSpec() + filter);

		} catch(Error e) {
			AppLog.error(e, getGrant());
		}
	}*/
}
