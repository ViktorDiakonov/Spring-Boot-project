package com.example.demowithtests.service;

import com.example.demowithtests.domain.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

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
     * Find all the records in the table where the name column is not null.
     *
     * @return A list of all the names in the database.
     */
    List<String> findAllByName();


    /**
     * Find all phone numbers.
     *
     * @return A list of all the phone numbers in the database.
     */
    List<String> findAllPhone();

}