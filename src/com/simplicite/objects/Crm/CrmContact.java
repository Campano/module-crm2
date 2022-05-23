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
	//private static final String INIT_FILTER_FLAG="contact_init_filter";

	@Override
	public void initRefSelect(ObjectDB parent) {
		Grant g = getGrant();

		String accId = parent.getFieldValue("crmAccName");
		AppLog.info(accId.toString(), g);

    // if () {
		// 	g.setParameter(INIT_FILTER_FLAG, false);
		// 	setFieldFilter("", );
    // }
	}
}
