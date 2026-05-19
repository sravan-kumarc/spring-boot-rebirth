package com.sravan.spring_rebirth_web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {

        return """
                <h1>Spring Boot Rebirth</h1>

                <hr>

                <h3>Available Pages</h3>

                <a href='/simplehello'>Simple Hello Page</a><br>
                <a href='/hello'>Hello Page</a><br>
                <a href='/welcome'>Welcome Page</a><br>
                <a href='/about'>About Page</a><br>
                <a href='/skills'>Skills Page</a><br>
                """;
    }

    @GetMapping("/simplehello")
    public String simpleHello() {

        return "Hello Sravan, Spring Boot Started Successfully!";
    }

    @GetMapping("/hello")
    public String hello() {

        return """
                <h2>Hello Page</h2>

                Hello Sravan, Spring Boot Started Successfully!

                <br><br>

                <a href='/'>Go Home</a>
                """;
    }

    @GetMapping("/welcome")
    public String welcome() {

        return """
                <h2>Welcome Page</h2>

                Welcome to Spring Boot Journey

                <br><br>

                <a href='/'>Go Home</a>
                """;
    }

    @GetMapping("/about")
    public String about() {

        return """
                <h2>About Page</h2>

                Myself Sravan Kumar.
                Working as Software Engineer.
                Currently learning Spring Boot.

                <br><br>

                <a href='/'>Go Home</a>
                """;
    }

    @GetMapping("/skills")
    public String skills() {

        return """
                <h2>Skills Page</h2>

                Java <br>
                AWS <br>
                Kubernetes <br>
                Jenkins <br>
                Spring Boot

                <br><br>

                <a href='/'>Go Home</a>
                """;
    }
}