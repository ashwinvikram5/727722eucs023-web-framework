package com.example.day6cy.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cy.model.AshwinEmployee;
import com.example.day6cy.repository.AshwinEmployeeRepo;

@Service
public class AshwinEmployeeService {
    public AshwinEmployeeRepo employeeRepo;
    public AshwinEmployeeService(AshwinEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean postEmployee(AshwinEmployee employee)
    {
        try{

            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<AshwinEmployee> sortEmployee(String field)
    {
        return employeeRepo.findAll(Sort.by(field));
    }
    public List<AshwinEmployee> paginationEmployee(int pageno,int size)
    {
        return employeeRepo.findAll(PageRequest.of(pageno, size)).getContent();
    }
    public List<AshwinEmployee>  sortPaginationEmployee(int pageno,int size,String field)
    {
        return employeeRepo.findAll(PageRequest.of(pageno, size,Sort.by(field))).getContent();
    }
}
