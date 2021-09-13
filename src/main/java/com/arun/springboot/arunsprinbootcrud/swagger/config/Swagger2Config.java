package com.arun.springboot.arunsprinbootcrud.swagger.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger2Config {
	
	@Bean
	public Docket swaggerConfig() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/arun/**"))
				.build()
				.apiInfo(new ApiInfo("Employee Data", "employee data api description", 
						"1.0", "http://kktech.com", 
						new Contact("name", "url", "arunjs46@gmail.com"), 
						"opensource", "http://kktech.com/license", 
						Collections.emptyList()));
	}

}
