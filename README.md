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

1. Spring Boot Setup (via Spring Initializr)

- Go to [Spring Initializr](https://start.spring.io/)
- Choose:
  - Project: Maven
  - Language: Java
  - Spring Boot: Latest Version
  - Dependencies: Spring Web, Spring Data JPA, MySQL Driver, Spring Boot DevTools
- Generate the project and import it into **Eclipse IDE** as a Maven Project

2. Create MySQL Database

Run the following SQL command:
CREATE DATABASE studentdb;

3. Configure application.properties
   
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8080

5. Run the Application

In Eclipse:
Right-click the project > Run As > Spring Boot App
📮 API Endpoints
Tested via Postman:

🔸 1. Register User
POST /api/users/register
{
  "username": "Ajini W",
  "password": "AjiniW@2005",
  "email": "ajiniw2005@gmail.com"
}
🔸 2. Login User
POST /api/users/login
{
  "username": "Ajini W",
  "password": "AjiniW@2005"
}
🔸 3. Get All Users
GET /api/users

🔸 4. Update User
PUT /api/users/{id}
{
  "username": "Ajini",
  "password": "Ajini@2005",
  "email": "ajini2005@gmail.com"
}
🔸 5. Delete User
DELETE /api/users/{id}

📂 Project Structure
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

💡 Future Improvements
Add JWT authentication
Add frontend (React/Angular)
Add pagination and sorting
Deploy on Heroku/AWS

