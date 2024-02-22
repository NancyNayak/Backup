package com.ems.db;

import com.ems.db.controller.EmployeeController;
import com.ems.db.document.Employee;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.io.IOException;

@SpringBootApplication
@EnableDiscoveryClient
public class EmsDbApplication {

	public static void main(String[] args) throws IOException, ParseException {
		SpringApplication.run(EmsDbApplication.class, args);
	}

}
