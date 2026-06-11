# Restaurant Management System API
A RESTful API developed with Java and Spring Boot for task management. This project was built to practice backend development concepts, REST APIs, database integration and software architecture best practices.

## Technologies
* Java 21
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* Swagger / OpenAPI

## Features
* Create tasks
* Retrieve all tasks
* Update existing tasks
* Delete tasks
* Request validation
* Global exception handling
* DTO architecture
* API documentation with Swagger

## Architecture
The project follows a layered architecture:

* Controller Layer
* Service Layer
* Repository Layer
* DTO Layer
* Database Layer

## API Endpoints
| Method | Endpoint    | Description       |
| ------ | ----------- | ----------------- |
| GET    | /tasks      | Get all tasks     |
| POST   | /tasks      | Create a new task |
| PUT    | /tasks/{id} | Update a task     |
| DELETE | /tasks/{id} | Delete a task     |

## Swagger Documentation
After running the application:
http://localhost:8080/swagger-ui/index.html

## Running the Project
1. Clone the repository

bash
git clone https://github.com/RuiCatembue/Restaurant-Management-System-API.git

2. Configure the database credentials in:

properties
src/main/resources/application.properties

3. Run the application

bash
mvn spring-boot:run

## Future Improvements
* Spring Security
* JWT Authentication
* User Management
* Unit Testing
* Docker Support

## Author
Rui Carlos da Costa Catembue
## GitHub: https://github.com/RuiCatembue
