package com.yilmazmertm.repository;

import com.yilmazmertm.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository{
    private List<Employee> employeeList;

    public EmployeeRepositoryImpl(){
        employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Jane"));
        employeeList.add(new Employee(2, "Jack"));
        employeeList.add(new Employee(3, "George"));
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    @Override
    public Employee getEmployee(int id) {
        return employeeList.get(id);
    }

    @Override
    public Employee updateEmployee(int id, String name) {
        Employee tempEmp = employeeList.get(id);
        tempEmp.setId(id);
        tempEmp.setFirstName(name);
        return tempEmp;
    }

    @Override
    public boolean deleteEmployee(int id) {
        employeeList.remove(id);
        return true;
    }

    @Override
    public Employee addEmployee(int id, String name) {
        Employee employee = new Employee(id, name);
        employeeList.add(employee);
        return employee;
    }

    @Override
    public int count() {
        return employeeList.size();
    }
}
