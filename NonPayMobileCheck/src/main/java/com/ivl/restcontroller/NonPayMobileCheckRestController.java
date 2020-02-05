package com.ivl.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivl.service.NonPayMobileCheckServiceImpl;
/**
 * 
 * @author pavan kumar paladugu
 *
 */
@RequestMapping("/nonPay")
@RestController
public class NonPayMobileCheckRestController {
	
	@Autowired
	private NonPayMobileCheckServiceImpl nonPayMobileCheckService;
	
	/**
	 * 
	 * @param deviceID this is the device-Id of the Mobile
	 * @return it returns the whether Mobile Pay Check is happening or not.
	 */
	
	@GetMapping("/mobileCheck/deviceId/{deviceId}")
	public boolean nonPayMobileCheck(Integer deviceID) {
		
		nonPayMobileCheckService.nonPayMobileCheck(deviceID);
		
		return false;
	}
	

}
