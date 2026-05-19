package com.sravan.spring_rebirth_web.controller;

import com.sravan.spring_rebirth_web.model.Employee;
import com.sravan.spring_rebirth_web.model.J3User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class J3PostController {

    @PostMapping("/test")
    public String testPost() {

        return "POST API Working Successfully!";
    }
    @PostMapping("/user")
    public String createUser(@RequestBody J3User user) {

        return """
                <h2>User Created Successfully</h2>

                Name: %s <br>
                Role: %s
                """.formatted(user.getName(), user.getRole());
    }

    @PostMapping("/employee")
    public String insertUser(@RequestBody Employee employee){
        return """
               <h2>Member Details</h2>
               
               Name: %s,
               Company: %s,
               Designation: %s
           
               """.formatted(employee.getName(), employee.getCompany(), employee.getDesignation());
    }
}