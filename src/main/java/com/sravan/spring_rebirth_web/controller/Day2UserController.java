package com.sravan.spring_rebirth_web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day2UserController {

    @GetMapping("/hello/{name}")
    public String dynamicHello(@PathVariable String name){

        return """
                <h2>Dynamic Hello Page</h2>
                Hello %s, welcome to Spring Boot!
                <br><br>
                <a href='/'>Go Home</a>
               """.formatted(name);

    }

    @GetMapping("/add/{num1}/{num2}")
    public String addNumbers(@PathVariable int num1,
                             @PathVariable int num2) {

        int result = num1 + num2;

        return """
            <h2>Addition Result</h2>

            Result = %d

            <br><br>

            <a href='/'>Go Home</a>
            """.formatted(result);
    }


}
