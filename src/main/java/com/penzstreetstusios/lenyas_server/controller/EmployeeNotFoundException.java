package com.penzstreetstusios.lenyas_server.controller;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("Could not found employee " + id);
    }
}
