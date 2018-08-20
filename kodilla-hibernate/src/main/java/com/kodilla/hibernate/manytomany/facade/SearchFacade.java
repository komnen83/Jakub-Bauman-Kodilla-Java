package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SearchFacade {

    private Company company;
    private Employee employee;
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public void searchProcess(final CompanyDao companyDao, final EmployeeDao employeeDao) throws SearchException{
        boolean wasError = false;
        LOGGER.info("Searching company name" + company.getName());
        if(!companyDao.findMatchingName(String "NAME")) {
            LOGGER.error(SearchException.ERR_COMPANY_NOT_FOUND);
            wasError = false;
            throw new SearchException(SearchException.ERR_COMPANY_NOT_FOUND);
        }
        LOGGER.info("Searching employee lastname" + employee.getLastname());
        if(!employeeDao.findMathingName(String "NAME")) {
            LOGGER.error(SearchException.ERR_EMPLOYEE_NOT_FOUND);
            wasError = false;
            throw new SearchException(SearchException.ERR_EMPLOYEE_NOT_FOUND);
        }
    }
}
