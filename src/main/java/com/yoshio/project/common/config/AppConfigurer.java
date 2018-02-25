package com.yoshio.project.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfigurer {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
