package com.ivl.service;


/**
 * 
 * @author pavan kumar paladugu
 *
 */

public interface NegativeCheckService {
	
	public boolean lostStolenMobileCheck(Integer deviceId);
	public boolean nonPayMobileCheck(Integer deviceId);

}
