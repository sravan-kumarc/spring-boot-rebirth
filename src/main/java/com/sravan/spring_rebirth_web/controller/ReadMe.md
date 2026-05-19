# Spring Boot Rebirth 🚀

This repository contains my Spring Boot backend engineering learning journey.

Currently learning and implementing:
- REST APIs
- CRUD Operations
- Spring Boot Controllers
- Request Handling
- JSON APIs
- Backend Application Flow

---

## Tech Stack

- Java 17
- Spring Boot
- Maven
- IntelliJ IDEA
- Postman
- Git & GitHub

---

## Topics Completed

### Spring Boot Basics
- Spring Boot setup
- Maven project structure
- Embedded Tomcat
- REST Controllers

### REST APIs
- `@RestController`
- `@GetMapping`
- `@PostMapping`
- `@PutMapping`
- `@DeleteMapping`

### Request Handling
- `@RequestParam`
- `@PathVariable`
- `@RequestBody`

### CRUD Operations
Implemented complete CRUD APIs using:
- In-memory `List<Employee>`

Operations:
- Create Employee
- Get All Employees
- Get Employee By ID
- Update Employee
- Delete Employee

---

## API Examples

### Create Employee

POST `/employees`

```json
{
  "uid": 1,
  "name": "Sravan",
  "company": "CGI",
  "designation": "SE"
}
