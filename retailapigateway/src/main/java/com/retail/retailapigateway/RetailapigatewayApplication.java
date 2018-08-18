package com.retail.retailapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class RetailapigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailapigatewayApplication.class, args);
	}
}
