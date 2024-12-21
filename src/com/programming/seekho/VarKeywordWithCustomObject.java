package com.programming.seekho;


public class VarKeywordWithCustomObject {

    public static void main(String[] args) {

        EmployeeUtility empUtil = new EmployeeUtility();

        //Employee names in capital letters
        System.out.println("Employees name in capital letters");
        var namesInUpperCase = empUtil.getAllEmployeeInCapitalLetters();
        namesInUpperCase.forEach(System.out::println);

        //Employee with maximum salary
        System.out.println("Employee with maximum salary");
        var employeeWithMaxSalary = empUtil.getMaxSalaryEmployee();
        System.out.println(employeeWithMaxSalary);

        //Employee in descending order
        System.out.println("Employee in descending order");
        var employeeInDescOrder = empUtil.getEmployeeInDescOrder();
        employeeInDescOrder.forEach(System.out::println);

    }
}
