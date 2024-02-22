package com.ems.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmsPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmsPortalApplication.class, args);
	}

}
