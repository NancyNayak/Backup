package com.ems.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmsApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmsApiGatewayApplication.class, args);
	}

}
