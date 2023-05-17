# Mapping_Practice

<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/Maven-3.0.6-brightgreen.svg" />
</a>
   <a >
    <img alt="MySQL" src="https://img.shields.io/badge/MySQL-blue.svg">
  </a>
</center>
This project is a basic web application that allows to manage students information.

---
<br>

## Framework Used
* Spring Boot

---
<br>

## Dependencies
The following dependencies are required to run the project:

* Spring Boot Dev Tools
* Spring Web
* Spring Data JPA
* MySQL Driver
* Lombok
* Validation
* Swagger

<br>

## Database Configuration
To connect to a MySQL database, update the application.properties file with the appropriate database URL, username, and password. The following properties need to be updated:
```
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/<DatabaseName>
spring.datasource.username = <userName>
spring.datasource.password = <password>
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true

```
<br>

## Language Used
* Java

---
<br>

## Data Model

The Job data model is defined in the Job class, which has the following attributes:
<br>

* Student Model
```
@Id
private String ID;
private String name;
private String age;
private String phoneNumber;
private String branch;
private String department;

@OneToOne
private Address address;
```

* Laptop Model
```
@Id
private String ID;
private String name;
private String brand;
private Integer price;

@OneToOne
private Student student;


```

* Course Model 
```
@Id
private String ID;
private String title;
private String description;
private String duration;

@ManyToMany
List<Student> studentList;
```

* Book Model
```
@Id
private String ID;

private String title;
private String author;
private String description;
private String price;

@ManyToOne
private Student student;
```

* Address Model
```
private Long addressId;private String landmark;
private String zipcode;
private String district;
private String state;
private String country;
```
## Data Flow

1. The user at client side sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.
4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

## DataBase Used
* SQL database
```
We have used Persistent database to implement CRUD Operations.
```
---
<br>

## Project Summary

The project is a basic web application built using Java and the Spring framework. It allows students to manage their profile information.

