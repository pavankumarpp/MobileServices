package com.ivl.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author pavan kumar paladugu
 *
 */
@RequestMapping("/checkMobile")
@RestController
public class LostStolenMobileCheckRestController {
	
	/**
	 * 
	 * @param deviceId this is the device_Id of the mobile
	 * @return it returns the whether Mobile is stolen or not
	 * 
	 */
	
	@GetMapping("/stolenOrNot/deviceId/{deviceId}")
	public Boolean checkMobileStolenOrNot(@PathVariable("deviceId") Integer deviceId){
		
		
		return true;	
	}
	
	
	
	

}
