package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.hibernate.annotations.NamedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@NamedQuery(
        name = "Employee.seekLastname",
        query = "FROM Employee WHERE lastname LIKE : %Smi%"
)

@NamedQuery(
        name = "Company.showFirstThreeLetters",
        query = "FROM Companies WHERE company_name LIKE : %Sof%"
)
@Service
public class ManyToManyFacade {

    @Autowired
    private Company company;
    private Employee employee;

}
