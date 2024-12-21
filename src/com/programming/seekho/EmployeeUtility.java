package com.programming.seekho;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeUtility {

    //Creating list of employees
    List<Employee> list = Arrays.asList(new Employee(1, "rajesh", "rajesh@gmail.com", 1111111, 18, 20000),
                                        new Employee(2, "ramesh", "ramesh@gmail.com", 2222222, 20, 40000),
                                        new Employee(3, "suraj", "suraj@gmail.com", 3333333, 40, 50000),
                                        new Employee(4, "anil", "anil@gmail.com", 4444444, 30, 30000),
                                        new Employee(5, "john", "john@gmail.com", 5555555, 50, 60000));

    //Get employee names in capital letters
    public  List<String> getAllEmployeeInCapitalLetters(){
        return list.stream().map(e -> e.getName().toUpperCase()).toList();
    }

    //Get Employee with maximum salary
    public Employee getMaxSalaryEmployee(){
        return list.stream().collect(Collectors.maxBy(Comparator.comparing(s -> s.getSalary()))).get();
    }

    //Get Employees in descending order
    public List<Employee> getEmployeeInDescOrder(){
        return list.stream().sorted(Comparator.comparing(Employee::getName).reversed()).toList();
    }
}
