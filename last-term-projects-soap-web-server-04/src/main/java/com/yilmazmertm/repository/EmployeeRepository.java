package com.yilmazmertm.repository;

import com.yilmazmertm.model.Employee;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> getAllEmployees();

    Employee getEmployee(int id);

    Employee updateEmployee(int id, String name);

    boolean deleteEmployee(int id);

    Employee addEmployee(int id, String name);

    int count();
}
