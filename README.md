# Simple-Tour-Package-API

A small Spring Boot REST API to manage tour packages (PostgreSQL + JPA).

## Requirements
- Java 17+
- Maven
- PostgreSQL (or use H2 for quick local tests)

## Setup (Postgres)
1. Create DB and user:
   ```sql
   CREATE DATABASE tourdb;
   CREATE USER touruser WITH ENCRYPTED PASSWORD 'tourpassword';
   GRANT ALL PRIVILEGES ON DATABASE tourdb TO touruser;


🔗 GitHub Repository: https://github.com/Palwe-Prajwal/Simple-Tour-Package-API

Project Summary:

Tech Stack: Java 17, Spring Boot, Spring Data JPA, PostgreSQL, Maven

Core Features:

Create Tour Package – POST /api/tours (Validates required fields)

List All Tours – GET /api/tours

Get Tour By ID – GET /api/tours/{id}

Validation & Error Handling – Returns proper HTTP status codes and descriptive error messages

Database: PostgreSQL (DDL auto update enabled for development)

Instructions: Included in the repository README with setup steps, example requests, and sample data.
