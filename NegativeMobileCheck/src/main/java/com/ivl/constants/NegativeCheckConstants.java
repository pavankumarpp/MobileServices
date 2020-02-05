package com.ivl.constants;

import org.springframework.stereotype.Component;

/**
 * 
 * @author pavan kumar paladugu
 *
 */

@Component
public class NegativeCheckConstants {
	
	public static final String MOBILE_NOT_STOLEN_CHECK_MSG="The Mobile is not Stolen";
	
	public static final String MOBILE_STOLEN_CHECK_MSG="The Mobile is Stolen";

	public static final String PAY_CHECK_MSG="Mobile Pay check is happening";
	
	public static final String NON_PAY_CHECK_MSG="Mobile Pay check is not happening";
	
}
