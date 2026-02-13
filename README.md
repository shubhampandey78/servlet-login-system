# Servlet Login System

## Overview
A simple authentication system built using Java Servlets, JSP, JDBC, and Maven.  
This project demonstrates MVC architecture, DAO pattern implementation, and session-based authentication.

---

## Features
- User login authentication using MySQL
- Session management
- Secure logout with session invalidation
- Cache control handling to prevent back-button access
- MVC architecture (Servlet as Controller, JSP as View, DAO as Model layer)
- Maven dependency management

---

## Tech Stack
- Java
- Servlets
- JSP
- JDBC
- MySQL
- Maven
- Apache Tomcat

---

## How to Run

1. Clone the repository  
2. Import into Eclipse as a Maven project  
3. Configure MySQL database  
4. Update DB credentials in DAO class  
5. Deploy on Apache Tomcat  
6. Access application at: http://localhost:8080/LoginApp

---

## Database Setup

Create database and table:

```sql
CREATE DATABASE login;

USE login;

CREATE TABLE users (
    uname VARCHAR(50),
    password VARCHAR(50)
);
