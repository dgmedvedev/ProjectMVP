package com.demo.projectmvp.screens.employees;

import com.demo.projectmvp.pojo.Employee;

import java.util.List;

public interface EmployeeListView {
    void showData(List<Employee> employees);
    void showError();
}