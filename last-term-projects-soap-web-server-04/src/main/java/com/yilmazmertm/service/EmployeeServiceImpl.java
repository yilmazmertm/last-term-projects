package com.yilmazmertm.service;

import com.yilmazmertm.model.Employee;
import com.yilmazmertm.repository.EmployeeRepository;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;
import javax.inject.Inject;

@WebService(serviceName = "EmployeeService", endpointInterface = "com.yilmazmertm.service.EmployeeService")
public class EmployeeServiceImpl implements EmployeeService{

    @Inject
    private EmployeeRepository employeeRepositoryImpl;

    @WebMethod
    @Override
    public Employee getEmployee(int id) {
        return employeeRepositoryImpl.getEmployee(id);
    }

    @WebMethod
    @Override
    public Employee updateEmployee(int id, String name) {
        return employeeRepositoryImpl.updateEmployee(id, name);
    }

    @WebMethod
    @Override
    public boolean deleteEmployee(int id) {
        return employeeRepositoryImpl.deleteEmployee(id);
    }

    @WebMethod
    @Override
    public Employee addEmployee(int id, String name) {
        return employeeRepositoryImpl.addEmployee(id, name);
    }

    @WebMethod
    @Override
    public int countEmployees() {
        return employeeRepositoryImpl.count();
    }

    @WebMethod
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepositoryImpl.getAllEmployees();
    }
}
