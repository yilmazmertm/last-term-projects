package com.yilmazmertm.config;

import com.yilmazmertm.service.EmployeeServiceImpl;

import javax.xml.ws.Endpoint;

public class EmployeePublisher {
    public static void main(String[] args) {

        Endpoint.publish("http://localhost:8080/employeeservice", new EmployeeServiceImpl());
    }
}
