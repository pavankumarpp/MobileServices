package com.ivl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 * 
 * @author pavan kumar paladugu
 *
 */

@Service
public class NegativeCheckServiceImpl implements NegativeCheckService {

	@Autowired
	private RestTemplate restTemplate;

	/**
	 * Here we are retrieving the end point url of the LastStoleMobileCheck Service
	 * 
	 */
	@Value("${Lost_Stolen_Mobile_Check_Url}")
	private String lostStolenMobileCheckUrl;

	/**
	 * Here we are retrieving the end point url of the NonPayMobileCheck Service

	 */
	@Value("${Non_Pay_Mobile_Check_Url}")
	private String nonPayMobileCheckUrl;
	
	/**
	 * Here we are calling the LastStoleMobileCheck Service
	 * 
	 */

	@Override
	public boolean lostStolenMobileCheck(Integer deviceId) {

		return restTemplate.getForObject(lostStolenMobileCheckUrl, Boolean.class, deviceId);

	}

	/**
	 * Here we are calling the nonPayMobileCheck Service
	 * 
	 */

	@Override
	public boolean nonPayMobileCheck(Integer deviceId) {

		return restTemplate.getForObject(nonPayMobileCheckUrl, Boolean.class, deviceId);

	}

}
