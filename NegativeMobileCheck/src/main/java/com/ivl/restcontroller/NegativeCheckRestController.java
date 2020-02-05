package com.ivl.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivl.constants.NegativeCheckConstants;
import com.ivl.service.NegativeCheckServiceImpl;

/**
 * 
 * @author pavan kumar paladugu
 *
 */

@RequestMapping("/NegativeCheck")
@RestController
public class NegativeCheckRestController {

	@Autowired
	private NegativeCheckServiceImpl negativeCheckService;

	
	

	/**
	 * 
	 * @param deviceId
	 * @return  it reurns the whether mobile is stolen or not . and Pay Check is happening or not
	 */
	
	@GetMapping("/checkDeviceId/deviceId/{deviceId}")
	public ResponseEntity<String> checkDeviceId(@PathVariable Integer deviceId) {

		
		if (negativeCheckService.lostStolenMobileCheck(deviceId)) {
			
			if (negativeCheckService.nonPayMobileCheck(deviceId)) {
				
				return new ResponseEntity<>(NegativeCheckConstants.PAY_CHECK_MSG, HttpStatus.OK);
			}
			return new ResponseEntity<>(NegativeCheckConstants.NON_PAY_CHECK_MSG, HttpStatus.OK);
		}
		return new ResponseEntity<>(NegativeCheckConstants.MOBILE_NOT_STOLEN_CHECK_MSG, HttpStatus.OK);
	}

}
