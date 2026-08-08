```markdown
# Spring Boot E-Commerce Backend

A RESTful e-commerce backend application built using Java and Spring Boot.

## Features

- Product CRUD operations
- Product search
- Product sorting
- Pagination

## API Endpoints

### Products

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/products` | Get all products |
| GET | `/api/product/{id}` | Get product by ID |
| POST | `/api/product` | Add a product |

## Database

The project currently uses an H2 in-memory database for development.

## Running the Project

### Prerequisites

- Java 21
- Maven
- Eclipse or another Java IDE