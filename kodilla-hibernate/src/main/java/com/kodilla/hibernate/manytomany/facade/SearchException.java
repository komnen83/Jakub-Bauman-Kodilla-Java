package com.kodilla.hibernate.manytomany.facade;

public class SearchException extends Exception {

    public static String ERR_EMPLOYEE_NOT_FOUND = "Employee not found";
    public static String ERR_COMPANY_NOT_FOUND = "Company not found";

    public SearchException(String message) {
        super(message);
    }
}
