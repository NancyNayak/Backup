package com.ems.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EsServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsServiceRegistryApplication.class, args);
	}

}
