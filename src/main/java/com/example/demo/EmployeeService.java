package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Employee> getAllEmployees() {

        return employeeRepository.findAll();
    }

    public Employee addEmployee(Employee employee) {

        Department dept = departmentRepository.findById(employee.getDepartment().getDepId()).orElse(null);
        if (null == dept) {
            dept = new Department();
        }
        dept.setDepName(employee.getDepartment().getDepName());
        employee.setDepartment(dept);
        return employeeRepository.save(employee);
    }

    public Employee editEmployees(Employee entity) {

        return employeeRepository.save(entity);
    }


    public void deleteEmployees(Integer empId) {

        employeeRepository.deleteById(empId);
    }
}
