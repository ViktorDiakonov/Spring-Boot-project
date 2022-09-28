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

    List<Employee>getEmployeeByPhoneU(String phone);

    Page<Employee> findByName(String name, int page, int size, List<String> sortList, String sortOrder);

    /**
     * Find all employees with the given address, and return them in a pageable format.
     *
     * @param address The address to search for.
     * @param page The page number to retrieve.
     * @param size The number of records to return per page.
     * @param sortList A list of fields to sort by.
     * @param sortOrder "asc" or "desc"
     * @return A Page<Employee> object.
     */
    Page<Employee> findByAddress(String address, int page, int size, List<String> sortList, String sortOrder);

}