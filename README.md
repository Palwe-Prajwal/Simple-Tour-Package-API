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
