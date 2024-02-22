package com.ems.db.controller;

import com.ems.db.document.Employee;
import com.ems.db.service.EmployeeService;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    LoadBalancerClient loadBalancerClient;

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeDetails(@PathVariable("id") String id) throws IOException, ParseException {
        Employee employee =  employeeService.getEmployeeById(id);
        FileReader reader = new FileReader("C:\\Users\\Nancy_Nayak\\IdeaProjects\\EMS\\ems-db\\src\\main\\resources\\mock\\sample.json");
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(reader);
        JSONObject jsonObject = (JSONObject) obj;
        JSONObject data = (JSONObject) jsonObject.get("data");
        JSONObject spendTrackerTrends = (JSONObject) data.get("spendTrackerTrends");
        JSONArray yearlySpendData = (JSONArray) spendTrackerTrends.get("yearlySpendData");
        yearlySpendData.forEach(x-> {
            JSONObject d = (JSONObject) x;
            System.out.println("year: " + d.get("year"));
            System.out.println("yearlyTotalSpend: " + d.get("yearlyTotalSpend"));
            System.out.println("yearlySpendAverage: " + d.get("yearlySpendAverage"));
        });
        JSONArray yearlySpendDataByCategory = (JSONArray) spendTrackerTrends.get("yearlySpendDataByCategory");
        yearlySpendDataByCategory.forEach(x-> {
            JSONObject d = (JSONObject) x;
            JSONArray yearlySpendData1 = (JSONArray) d.get("yearlySpendData");
            yearlySpendData1.forEach(y->{
                JSONObject e = (JSONObject) y;
                System.out.println("year: " + e.get("year"));
                System.out.println("yearlyTotalSpend: " + e.get("yearlyTotalSpend"));
                System.out.println("yearlySpendAverage: " + e.get("yearlySpendAverage"));
            });
            System.out.println("categoryName: " + d.get("categoryName"));
            System.out.println("categoryGuid: " + d.get("categoryGuid"));

        });
        return ResponseEntity.status(HttpStatus.OK).body(employee);
    }
}
