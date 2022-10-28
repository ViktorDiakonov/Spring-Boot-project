package com.example.demowithtests.service;

import com.example.demowithtests.domain.Employee;
import org.springframework.data.domain.Page;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface Service {

    Employee create(Employee employee);

    List<Employee> getAll();

    Employee getById(Integer id);

    Employee updateById(Integer id, Employee employee);

    void removeById(Integer id);

    void removeAll();

    List<Employee> getName(String name);

    List<Employee> getCountry(String country);

    List<Employee> getAllName(String name);

    List<Employee> getNameByPhone(String phone);

    Employee updateByPhone(String phone, Employee employee);

    List<Employee> getEmployeeByPhoneU(String phone);


    /**
     * Find all employees with the given name, and return them in a page of size - size, sorted by the given sortList in the
     * given sortOrder.
     *
     * @param name      The name of the employee to search for.
     * @param page      The page number to retrieve.
     * @param size      The number of records per page.
     * @param sortList  A list of fields to sort by.
     * @param sortOrder "asc" or "desc"
     * @return Page<Employee>
     */
    Page<Employee> findByName(String name, int page, int size, List<String> sortList, String sortOrder);

    /**
     * Find all employees with the given address, and return them in a pageable format.
     *
     * @param address   The address to search for.
     * @param page      The page number to retrieve.
     * @param size      The number of records to return per page.
     * @param sortList  A list of fields to sort by.
     * @param sortOrder "asc" or "desc"
     * @return A Page<Employee> object.
     */
    Page<Employee> findByAddress(String address, int page, int size, List<String> sortList, String sortOrder);


    /**
     * Find all employees, sort them by the given list of fields, and return the page of results.
     *
     * @param page      The page number to be retrieved.
     * @param size      The number of records to return per page.
     * @param sortList  A list of fields to sort by.
     * @param sortOrder The sort order, either "asc" or "desc".
     * @return A Page<Employee> object.
     */
    Page<Employee> findAll(int page, int size, List<String> sortList, String sortOrder);


//---------------------------------------------------Stream-----------------------------------------------------------
    /**
     * Search for different countries in the database.
     *
     * @return A list of all different countries in the database.
     */
    List<String> findDifferentCountries();


    /**
     * Find all phone numbers.
     *
     * @return A list of all the phone numbers in the database.
     */
    List<String> findAllPhone();


    /**
     * Find all the short names in the database.
     *
     * @return A list of strings.
     */
    List<String> findShortNames();


    /**
     * Find all the phone numbers and names of people who have a phone number.
     *
     * @return A list of strings.
     */
    List<String> findPhoneAndName();


    /**
     * "Given a username, return a UserDetails object that represents the user."
     *
     * The UserDetails object is a Spring Security interface that represents a user. It has a number of methods that return
     * information about the user, such as their username, password, and authorities
     *
     * @param username The username of the user you want to load.
     * @return A UserDetails object.
     */
    UserDetails loadUserByUsername(String username);

}