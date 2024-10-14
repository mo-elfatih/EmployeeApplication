-- Hibernate: create table departments (id bigint not null, name varchar(255), primary key (id))
-- Hibernate: create table employees (id bigint not null, department_id bigint not null, email varchar(255), name varchar(255), position varchar(255), salary double, primary key (id))
-- Hibernate: alter table employees add constraint FK... foreign key (department_id) references departments


INSERT INTO departments (id, name) VALUES (1, 'IT'), (2, 'HR');

INSERT INTO employees (name, email, position, salary, department_id) 
VALUES 
('Alice', 'alice@example.com', 'Developer', 70000, 1),
('Bob', 'bob@example.com', 'Analyst', 50000, 2);
