package com.interactive.employeeApplication.service;

import com.interactive.employeeApplication.model.Employee;
import com.interactive.employeeApplication.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    public Employee updateEmployee(Long id, Employee employeeDetails) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if (employeeOptional.isPresent()) {
            Employee employee = employeeOptional.get();
            employee.setName(employeeDetails.getName());
            employee.setEmail(employeeDetails.getEmail());
            employee.setPosition(employeeDetails.getPosition());
            employee.setSalary(employeeDetails.getSalary());
            employee.setDepartment(employeeDetails.getDepartment());
            return employeeRepository.save(employee);
        }
        return null; // Or throw an exception if not found
    }

    public List<Employee> searchByName(String name) {
        return employeeRepository.findByNameContaining(name);
    }

    public Page<Employee> findAllPaginated(int page, int size) {
        return employeeRepository.findAll(PageRequest.of(page, size));
    }

    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
}