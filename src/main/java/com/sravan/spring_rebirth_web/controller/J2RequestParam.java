package com.sravan.spring_rebirth_web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class J2RequestParam {
    @GetMapping("/greet")
    public String greetings(@RequestParam String name){
        return """
            <h2>Greeting Page</h2>
            Hello %s, how are you buddy?
            <br><br>
            <a href='/'>Go Home</a>
            """.formatted(name);
    }

    @GetMapping("/calculator")
    public String calculator(@RequestParam int a,
                             @RequestParam int b) {

        int result = a + b;

        return """
            <h2>Calculator Result</h2>
            %d + %d = %d
            <br><br>

            <a href='/'>Go Home</a>
            """.formatted(a, b, result);
    }

    @GetMapping("/vote")
    public String vote(@RequestParam int age) {

        if (age >= 18) {
            return "Eligible for Voting";
        }

        return "Not Eligible for Voting";
    }

    @GetMapping("/userinfo")
    public String userinfo(@RequestParam String name,
                            @RequestParam String role) {

        return """
            <h2>Greeting Page</h2>
            Name: %s
            Role: %s
            <br><br>
            <a href='/'>Go Home</a>
            """.formatted(name, role);
    }
}
