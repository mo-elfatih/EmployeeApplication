package com.interactive.employeeApplication.service;

import com.interactive.employeeApplication.model.Department;
import com.interactive.employeeApplication.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    public Optional<Department> findById(Long id) {
        return departmentRepository.findById(id);
    }

    public List<Department> searchByName(String name) {
        return departmentRepository.findByNameContaining(name);
    }

    public void deleteById(Long id) {
        departmentRepository.deleteById(id);
    }
}