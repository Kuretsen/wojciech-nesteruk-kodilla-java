package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    public List<Employee> searchEmployeeByLastName(String lastname) throws SearchProcessException {
        List<Employee> employeeList = employeeDao.retrieveFromPartOfLastName(lastname);
        if (employeeList.isEmpty()){
            LOGGER.error("Employee not found");
            throw new SearchProcessException("No matching employees");
        }else {
            employeeList.forEach(emp -> LOGGER.info("Matching employee found"));
            return employeeList;
        }
    }

    public List<Company> searchCompanyByName(String companyName) throws SearchProcessException{
        List<Company> companyList = companyDao.retrieveCompaniesByName(companyName);
        if (companyList.isEmpty()) {
            LOGGER.error("Company not found");
            throw new SearchProcessException("Mp maching companies");
        } else {
            companyList.forEach(company -> LOGGER.info("Maching company found: "));
            return companyList;
        }
    }
}