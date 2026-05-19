package com.sravan.spring_rebirth_web.controller;

import com.sravan.spring_rebirth_web.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class J4EmployeeController {

    List<Employee> employeeList = new ArrayList<>();

    @PostMapping("/employees")
    public String createEmployee(@RequestBody Employee employee) {

        employeeList.add(employee);

        return """
                Employee Added Successfully
                
                Name: %s <br>
                UID: %d
                Company: %s <br>
                Designation: %s
                """.formatted(
                employee.getName(),
                employee.getUid(),
                employee.getCompany(),
                employee.getDesignation()
        );
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {

        return employeeList;
    }

    @PutMapping("/employees/{id}")
    public String updateEmployee(@PathVariable int id,
                                 @RequestBody Employee updatedEmployee) {

        for (Employee employee : employeeList) {

            if (employee.getUid() == id) {

                employee.setName(updatedEmployee.getName());
                employee.setCompany(updatedEmployee.getCompany());
                employee.setDesignation(updatedEmployee.getDesignation());

                return "Employee Updated Successfully";
            }
        }

        return "Employee Not Found";
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeList(@PathVariable int id) {
        for (Employee employee : employeeList) {

            if (employee.getUid() == id) {

                return employee;
            }
        }
            return null;
    }
}

