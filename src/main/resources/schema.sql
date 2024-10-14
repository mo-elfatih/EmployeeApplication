CREATE TABLE departments (
  id BIGINT PRIMARY KEY,
  name VARCHAR(255) NOT NULL
);

CREATE TABLE employees (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255),
  email VARCHAR(255),
  position VARCHAR(255),
  salary DOUBLE,
  department_id BIGINT,
  CONSTRAINT fk_department FOREIGN KEY (department_id) REFERENCES departments(id)
);
