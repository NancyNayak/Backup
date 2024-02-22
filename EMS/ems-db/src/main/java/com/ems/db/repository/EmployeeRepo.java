package com.ems.db.repository;

import com.ems.db.document.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepo extends MongoRepository<Employee, String> {

}
