package com.ems.db.service;

import com.ems.db.document.Employee;
import com.ems.db.repository.EmployeeRepo;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee getEmployeeById(String id){
        Optional<Employee> res = employeeRepo.findById(id);
        return res.get();
    }

    public void readJsonObject() throws IOException, ParseException {
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
    }

}
