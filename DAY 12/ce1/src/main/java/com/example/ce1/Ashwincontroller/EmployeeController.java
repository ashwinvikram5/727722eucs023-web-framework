package com.example.ce1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce1.model.Employee;
import com.example.ce1.service.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    AshwinEmployeeService employeeService;

    @PostMapping("/employee")
    public AshwinEmployee setMethod(@RequestBody AshwinEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<AshwinEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<AshwinEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
