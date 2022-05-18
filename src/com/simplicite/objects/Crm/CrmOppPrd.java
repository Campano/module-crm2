package com.simplicite.objects.Crm;

import java.util.*;

import com.simplicite.util.*;
import com.simplicite.util.exceptions.*;
import com.simplicite.util.tools.*;

/**
 * Business object CrmOppPrd
 */
public class CrmOppPrd extends ObjectDB {
	private static final long serialVersionUID = 1L;

	@Override
	public String postSave() {
		Grant g = getGrant();

		ObjectDB oppPrd = g.getTmpObject("CrmOppPrd");

		synchronized(oppPrd) {
			// set the filter to get every oppPrd from the current opportunity
			oppPrd.resetFilters();
			String oppId = getFieldValue("crmOppprdOppId");
			oppPrd.setFieldFilter("crmOppprdOppId", oppId);

			try {
				List<String[]> res = oppPrd.search();
				Double total = 0.00;
				for (String[] row : res) {
					oppPrd.setValues(row);
					int quantity = oppPrd.getField("crmOppprdQuantity").getInt(0);
					double unitPrice = oppPrd.getField("crmOppprdPrdId.crmPrdPrice").getDouble(0.00);

					total += quantity * unitPrice;
				}

				// get opportunity record and set amount value
				ObjectDB opp = g.getTmpObject("CrmOpportunity");
				BusinessObjectTool oppTool = opp.getTool();
				oppTool.select(oppId);
				opp.getField("crmOppAmount").setValue(total);
				oppTool.validateAndSave();
			} catch (Exception e) {
				AppLog.error(e, g);
			}
		}
		return null;
	};
}
