Todo App – CS223 Final Project

A full-stack Todo List web application built using Spring Boot and PostgreSQL.
This application allows users to securely manage their personal tasks with authentication and user-specific todo lists.

Live Demo
https://powerful-ambition-production-c297.up.railway.app

Features
User registration and login
Secure authentication with Spring Security
Add, complete, and delete todos
Each user has their own todo list
Responsive user interface using Thymeleaf
Password encryption using BCrypt

Tech Stack
Layer
Backend: Java 17, Spring Boot 3
Database: PostgreSQL
Frontend:	Thymeleaf, HTML, CSS
Security:	Spring Security, BCrypt
Build Tool:	Maven
Deployment:	Railway
Version Control: GitHub

Database Schema
Users Table
| Column   | Type    | Description        |
|----------|---------|--------------------|
| id       | BIGINT  | Primary key        |
| username | VARCHAR | Display name       |
| email    | VARCHAR | Unique email       |
| password | VARCHAR | Encrypted password |

Todos Table
Todos Table
| Column    | Type    | Description          |
|-----------|---------|----------------------|
| id        | BIGINT  | Primary key          |
| title     | VARCHAR | Todo description     |
| completed | BOOLEAN | Completion status    |
| user_id   | BIGINT  | Foreign key to users |

Running the Project Locally
Prerequisites
Make sure you have installed:
Java 17+
PostgreSQL
Maven

1️. Clone the repository
git clone https://github.com/saoryy11/todo-app.git
cd todo-app

2️. Create the PostgreSQL database
CREATE DATABASE todoapp;

3️. Configure database connection
Update src/main/resources/application.properties:
spring.datasource.url=jdbc:postgresql://localhost:5432/todoapp
spring.datasource.username=your_username
spring.datasource.password=your_password

4️. Run the application
./mvnw spring-boot:run

5️. Open the application
Visit:
http://localhost:8080

Deployment
The application is deployed using Railway.

Deployment Steps
_Push the project to GitHub
_Create a new Railway project
_Connect the GitHub repository
_Add a PostgreSQL service
_Configure environment variables:
SPRING_DATASOURCE_URL
SPRING_DATASOURCE_USERNAME
SPRING_DATASOURCE_PASSWORD

Railway will automatically build and deploy the application.

Author
Name: Saory Soy
GitHub: https://github.com/saoryy11
Email: ssoy3@paragoniu.edu.kh

Course
CS223-Object-oriented programming
Instructor's name: Ruslan Isaev
Paragon International University
