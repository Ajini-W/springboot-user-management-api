# Spring Boot User Management API

A simple RESTful API built with Spring Boot, MySQL, and JPA to manage users with CRUD operations and basic login functionality.

## 🚀 Features

- Create/Register a new user
- User login authentication
- Retrieve all users
- Update user information
- Delete a user
- RESTful API tested with Postman

## 🛠️ Tools & Technologies

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman
- Eclipse IDE

## 📦 Dependencies

- Spring Web
- Spring Data JPA
- MySQL Driver
- Spring Boot DevTools

## ⚙️ Setup Instructions

### 1. Spring Boot Setup (via Spring Initializr)

- Go to [Spring Initializr](https://start.spring.io/)
- Choose:
  - Project: Maven
  - Language: Java
  - Spring Boot: Latest Version
  - Dependencies: Spring Web, Spring Data JPA, MySQL Driver, Spring Boot DevTools
- Generate the project and import it into **Eclipse IDE** as a Maven Project

### 2. Create MySQL Database

Open MySQL and run:
CREATE DATABASE studentdb;

### 3. Configure application.properties
In src/main/resources/application.properties

### 4. Create Entity Class
Create a file TaskEntity.java in com.example.taskentity.entity

### 5. Create Repository Interface
Create a file TaskRepository.java in com.example.taskentity.repository

### 6. Create Service Class
Create a file TaskService.java in com.example.taskentity.service

### 7. Create Controller Class
Create a file TaskController.java in com.example.taskentity.controller

### 8. Run Your Application
Right-click project > Run As > Spring Boot App

### 9.Tested via Postman:

📮 API Endpoints

🔹 1. Register a User

Method: POST

URL: http://localhost:8080/api/users/register

Body (JSON):
{
  "username": "Ajini W",
  "password": "AjiniW@2005",
  "email": "ajiniw2005@gmail.com"
}

🔹 2. Login User

Method: POST

URL: http://localhost:8080/api/users/login

Body (JSON):
{
  "username": "Ajini W",
  "password": "AjiniW@2005"
}

🔹 3. Get All Users

Method: GET

URL: http://localhost:8080/api/users

Body: Not required

🔹 4. Update a User

Method: PUT

URL: http://localhost:8080/api/users/{id}

Body (JSON):
{
  "username": "Ajini",
  "password": "Ajini@2005",
  "email": "ajini2005@gmail.com"
}

🔹 5. Delete a User

Method: DELETE

URL: http://localhost:8080/api/users/{id}

Body: Not required	


### 📂 Project Structure

src

├── main

│   ├── java

│   │   └── com.example.taskentity

│   │       ├── controller

│   │       │   └── TaskController.java

│   │       ├── service

│   │       │   └── TaskService.java

│   │       ├── repository

│   │       │   └── TaskRepository.java

│   │       └── entity

│   │           └── TaskEntity.java

│   └── resources

│       └── application.properties

### 💡 Future Improvements

Add JWT authentication

Add frontend (React/Angular)

Add pagination and sorting

Deploy on Heroku/AWS

