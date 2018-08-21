package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchFacade {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public List<Employee> searchEmployeesWithLastnameLike(final String arg) throws SearchException {
        boolean wasError = false;
        List<Employee> employeesWithLastnameSearchResult = new ArrayList<>();
        employeesWithLastnameSearchResult.addAll(employeeDao.retrieveEmployeesWithLastnameLike(arg));
        if(employeesWithLastnameSearchResult.size() == 0) {
            LOGGER.error(SearchException.ERR_EMPLOYEE_NOT_FOUND);
            wasError = true;
            throw new SearchException(SearchException.ERR_EMPLOYEE_NOT_FOUND);
        } else {
            return employeesWithLastnameSearchResult;
        }
    }

    public List<Employee> searchCompanyWithCompanyNameLike(final String arg) throws SearchException {
        boolean wasError = false;
        List<Company> companyWithCompanyNameSearchResult = new ArrayList<>();
        companyWithCompanyNameSearchResult.addAll(companyDao.retrieveCompaniesWithCompanyNameLike(arg));
        if(companyWithCompanyNameSearchResult.size() == 0) {
            LOGGER.error(SearchException.ERR_COMPANY_NOT_FOUND);
            wasError = true;
            throw new SearchException(SearchException.ERR_COMPANY_NOT_FOUND);
        } else {
            return companyWithCompanyNameSearchResult;
        }
    }
}
