# Challenge Lab 1: Microservice-Based Web Application

## Project Overview
This project implements a complete microservice-based web application using Spring Boot, PostgreSQL, and Redis. The application provides a book management system with RESTful APIs, a simple frontend interface, containerization, caching, and comprehensive testing.

## Technologies Used
- **Backend**: Spring Boot
- **Database**: PostgreSQL
- **Caching**: Redis
- **API Documentation**: Swagger/OpenAPI
- **Frontend**: HTML5, CSS3, JavaScript
- **Testing**: JUnit, Mockito, Cypress
- **Containerization**: Docker, Docker Compose
- **Project Management**: Jira (Scrum methodology)

## Project Structure
The project is organized into multiple versions, each adding new functionality:

1. **Version 1**: Basic Spring Boot application with H2 database
2. **Version 2**: Added service layer and proper ResponseEntity handling
3. **Version 3**: Swagger documentation and PostgreSQL integration
4. **Version 4**: Redis caching implementation
5. **Version 5**: Unit and integration tests
6. **Version 6**: Simple frontend web page
7. **Version 7**: Cypress end-to-end testing
8. **Version 8**: Full containerization with Docker

## Getting Started

### Prerequisites
- Java 17+
- Maven
- Docker and Docker Compose
- Node.js (for Cypress tests)
- PostgreSQL
- Redis

### Installation and Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/KhaledZeineb/scrum-project.git
   cd scrum-project
   ```

2. **Set up PostgreSQL**:
   - Create a database named `bookdb`
   - Update the connection details in `application.properties`

3. **Run Redis**:
   ```bash
   docker run -d -p 6379:6379 --name redis redis
   ```

### Running the Application

#### Option 1: Run with Docker Compose
```bash
docker-compose up --build
```

#### Option 2: Run Manually
1. **Backend**:
   ```bash
   mvn spring-boot:run
   ```

2. **Frontend**:
   - Open `frontend.html` in a web browser

### Accessing Services
- **Application**: http://localhost:8080
- **Swagger UI**: http://localhost:8080/swagger-ui.html
- **H2 Console**: http://localhost:8080/h2-console (for Version 1 only)
- **Frontend**: http://localhost:3000 (when running with Docker Compose)

## API Endpoints
The application provides the following RESTful endpoints:

- `POST /api/books` - Create a new book
- `GET /api/books` - Retrieve all books
- `GET /api/books/{isbn}` - Retrieve a specific book by ISBN
- `PUT /api/books/{isbn}` - Update a book
- `DELETE /api/books/{isbn}` - Delete a book

## Testing

### Unit and Integration Tests
```bash
mvn test
```

### End-to-End Tests with Cypress
1. Install Cypress:
   ```bash
   npm install cypress --save-dev
   ```

2. Run Cypress:
   ```bash
   npm run cypress:open
   ```

## Project Management
The project was managed using Jira with Scrum methodology. Key artifacts:

### Epics
1. **Core Microservice**: Backend development with Spring Boot and PostgreSQL
2. **Frontend Integration & Backend Containerization**: Web interface and Docker setup
3. **Infrastructure & Quality**: Caching, documentation, and testing

### Sprints
1. **Sprint 1**: Core Microservice (Backend API, PostgreSQL, Swagger)
2. **Sprint 2**: Frontend & Containerization (Web page, CORS, Dockerfiles)
3. **Sprint 3**: Caching + Testing (Redis, unit/integration tests)

## Docker Configuration
The project includes:
- `Dockerfile` for the Spring Boot backend
- `Dockerfile` for the frontend static page
- `docker-compose.yml` to orchestrate all services (backend, frontend, PostgreSQL, Redis)

## Future Improvements
- Add authentication and authorization
- Implement more comprehensive error handling
- Enhance frontend with a modern framework (React, Vue.js)
- Add CI/CD pipeline
- Implement monitoring and logging

## License
This project is licensed under the MIT License.
