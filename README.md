```markdown
# Spring Boot E-Commerce Backend

A RESTful e-commerce backend application built using Java and Spring Boot.
This project provides APIs for managing products, including creating, retrieving, updating, deleting, searching, sorting, pagination, and product image handling.

## Features

- Product CRUD operations
- Product search
- Product sorting
- Pagination
- Product image upload and retrieval
- Input validation
- Global exception handling
- Spring Data JPA
- Hibernate ORM
- H2 database
- RESTful API architecture

## Tech Stack

| Technology | Purpose |
|---|---|
| Java 21 | Programming language |
| Spring Boot | Backend framework |
| Spring MVC | REST API development |
| Spring Data JPA | Database access |
| Hibernate | ORM |
| H2 Database | Development database |
| Maven | Dependency management and build |
| Lombok | Reducing boilerplate code |

## API Endpoints

### Products

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/products` | Get all products |
| GET | `/api/product/{id}` | Get product by ID |
| POST | `/api/product` | Add a product |
| PUT | `/api/product/{id}` | Update a product |
| DELETE | `/api/product/{id}` | Delete a product |

## Database

The project currently uses an H2 in-memory database for development.

## Running the Project

### Prerequisites

- Java 21
- Maven
- Eclipse or another Java IDE

This project was built as a learning project to understand backend development with Spring Boot and to practice building REST APIs with database integration.

The project is being developed incrementally as new Spring Boot concepts are learned.