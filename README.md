# Registration Form Web Application

A full-stack Registration Form application developed using HTML, CSS, JavaScript, Java Spring Boot and MySQL. This project allows users to submit their personal details through a registration form and stores the information in a MySQL database.

## Project Structure

```text
Registration-from/
│
├── registration-frontend/
│   ├── registration.html
│   └── registration.css
│
├── registration-backend/
│   ├── src/
│   ├── pom.xml
│   └── README.md
│
└── .gitignore
```

## Technologies Used

### Frontend
- HTML5
- CSS3
- JavaScript

### Backend
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- REST API
- Maven

### Database
- MySQL

### Tools
- IntelliJ IDEA
- Postman
- Git
- GitHub

## Features

- User Registration Form
- User Personal Details
- Form Data Validation
- REST API Integration
- Backend Data Processing
- MySQL Database Connectivity
- Save Registration Details

## Registration Fields

- Name
- Email
- Password
- Mobile Number
- Gender
- Date of Birth
- City
- State
- Pincode
- Address

## Backend Architecture

The backend follows the layered architecture:

1. Controller – Handles HTTP requests.
2. Service – Contains business logic.
3. Repository – Handles database operations.
4. Entity – Represents database tables.
5. DTO – Transfers data between frontend and backend.

## API Endpoint

**Save Registration**

```http
POST /api/registration/save
```

Local URL:

```text
http://localhost:8080/api/registration/save
```

## Database Configuration

Database: MySQL

Database Name: `Registration_db`

Configure database credentials in:

`application.properties`

## How to Run the Project

### Backend

1. Open the backend folder in IntelliJ IDEA.
2. Configure MySQL database.
3. Create the `Registration_db` database.
4. Run `RegistrationFormApplication.java`.
5. Backend starts on port 8080.

### Frontend

1. Open the frontend folder.
2. Open `registration.html` in your browser.
3. Fill in the registration form.
4. Submit the form to save the data.

## Testing

API endpoints can be tested using Postman.

## Author

**Sonu Kumar**

## Project Status

In Development
