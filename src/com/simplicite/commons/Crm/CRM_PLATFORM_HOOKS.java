package com.simplicite.commons.Crm;

import java.util.*;

import com.simplicite.util.*;
import com.simplicite.util.exceptions.*;
import com.simplicite.util.tools.*;

/**
 * Shared code CRM_PLATFORM_HOOKS
 */
public class CRM_PLATFORM_HOOKS extends com.simplicite.util.engine.PlatformHooksInterface {
	private static final long serialVersionUID = 1L;

	@Override
	public void postLoadGrant(Grant g) {
		Grant.addResponsibility(Grant.getUserId(g.getLogin()), "CRM_GROUP");
	}
}
