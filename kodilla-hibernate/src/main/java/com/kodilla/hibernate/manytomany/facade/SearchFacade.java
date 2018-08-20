package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {

    private Company company;
    private Employee employee;
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public List<Company> searchCompany(final CompanyDao companyDao) throws SearchException {
        boolean wasError = false;
        LOGGER.info("Searching company name" + company.getName());
        if (!companyDao.findMatchingName(String "Nie wiem co tutaj za argumentu uzyc")) {
            LOGGER.error(SearchException.ERR_COMPANY_NOT_FOUND);
            wasError = false;
            throw new SearchException(SearchException.ERR_COMPANY_NOT_FOUND);
        }
        return List<Company>;
    }

    public List<Employee> searchEmployee(final EmployeeDao employeeDao) throws  SearchException {
        boolean wasError = false;
        LOGGER.info("Searching employee lastname" + employee.getLastname());
        if(!employeeDao.findMatchingName(String "Nie wiem co tutaj za argumentu uzyc")) {
            LOGGER.error(SearchException.ERR_EMPLOYEE_NOT_FOUND);
            wasError = false;
            throw new SearchException(SearchException.ERR_EMPLOYEE_NOT_FOUND);
        }
        return List<Employee>;
    }
}
