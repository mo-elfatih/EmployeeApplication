# Employee API

A Spring Boot RESTful API that provides CRUD operations for managing employees and their associations with departments.

## Technologies Used
- Java 8
- Spring Boot 2.5.12
- H2 Database
- Maven

## Getting Started
1. Clone the repository: `git clone https://github.com/mo-elfatih/EmployeeApplication.git`
2. Navigate to the project directory: `cd EmployeeApplication`
3. Run the application: `mvn spring-boot:run`
4. Access the API at `http://localhost:8080/api/employees`

## End Points:
This API manages employee records. Below are the available endpoints:

**1. Create Employee**
Endpoint: POST /api/employees
Request Body:
json
Copy code
{
    "name": "John Doe",
    "email": "john.doe@example.com",
    "position": "Developer",
    "salary": 60000,
    "department": {
        "id": 1  // Existing department ID
    }
}

**2. Update Employee**
Endpoint: PUT /api/employees/{id}
Request Body:
json
Copy code
{
    "name": "Jane Doe",
    "email": "jane.doe@example.com",
    "position": "Senior Developer",
    "salary": 75000,
    "department": {
        "id": 2  // Existing department ID
    }
}

**3. Get Employee by ID**
Endpoint: GET /api/employees/{id}

**4. Search Employees by Name**
Endpoint: GET /api/employees/search?name={name}&page={page}&size={size}

**5. Get All Employees (Paginated)**
Endpoint: GET /api/employees?page={page}&size={size}

**6. Delete Employee**
Endpoint: DELETE /api/employees/{id}
