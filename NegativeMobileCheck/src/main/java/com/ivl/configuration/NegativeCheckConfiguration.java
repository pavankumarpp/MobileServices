package com.ivl.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


/**
 * 
 * @author pavan kumar paladugu
 *
 */

@Configuration
@Component
public class NegativeCheckConfiguration {
	
	/**
	 * 
	 * @return here it is returning the RestTemplate Object
	 */
	
	@Bean
	public RestTemplate getRestTemplate() {
		
		return new RestTemplate();
	}

}
