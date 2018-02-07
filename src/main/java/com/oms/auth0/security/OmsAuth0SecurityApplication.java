package com.oms.auth0.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.oms.auth0.security")
@PropertySources({
	@PropertySource("classpath:application.properties"),
	@PropertySource("classpath:auth0.properties")
})
public class OmsAuth0SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmsAuth0SecurityApplication.class, args);
	}
}
