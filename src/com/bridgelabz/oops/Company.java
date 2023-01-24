package com.bridgelabz.oops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Company {
    static ArrayList<Employee> employeeList = new ArrayList<>();

    void addEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name");
        String name = scanner.next();
        System.out.println("enter employee age");
        int age = scanner.nextInt();
        System.out.println("Enter Employee phone number");
        long phoneNumber = scanner.nextLong();
        System.out.println("Enter the state");
        String state = scanner.next();
        System.out.println("Enter the department");
        String department = scanner.next();
        Employee employee = new Employee();
        employee.setName(name);
        employee.setAge(age);
        employee.setPhoneNumber(phoneNumber);
        employee.setState(state);
        employee.setDepartment(department);

    }

    static void bigBazar() {
        System.out.println("Employee of big bazar");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name");
        String name = scanner.next();
        System.out.println("enter employee age");
        int age = scanner.nextInt();
        System.out.println("Enter Employee phone number");
        long phoneNumber = scanner.nextLong();
        System.out.println("Enter the state");
        String state = scanner.next();
        System.out.println("Enter the department");
        String department = scanner.next();
        Employee employee1 = new Employee();
        employee1.setName(name);
        employee1.setAge(age);
        employee1.setPhoneNumber(phoneNumber);
        employee1.setState(state);
        employee1.setDepartment(department);
        Employee employee2 = new Employee();
        employee2.setName(name);
        employee2.setAge(age);
        employee2.setPhoneNumber(phoneNumber);
        employee2.setState(state);
        employee2.setDepartment(department);


    }

    static void jioMart() {
        System.out.println("employee of jiomart");
        System.out.println("Employee of big bazar");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name");
        String name = scanner.next();
        System.out.println("enter employee age");
        int age = scanner.nextInt();
        System.out.println("Enter Employee phone number");
        long phoneNumber = scanner.nextLong();
        System.out.println("Enter the state");
        String state = scanner.next();
        System.out.println("Enter the department");
        String department = scanner.next();
        Employee employee3 = new Employee();
        employee3.setName(name);
        employee3.setAge(age);
        employee3.setPhoneNumber(phoneNumber);
        employee3.setState(state);
        employee3.setDepartment(department);
        Employee employee4 = new Employee();
        employee4.setName(name);
        employee4.setAge(age);
        employee4.setPhoneNumber(phoneNumber);
        employee4.setState(state);
        employee4.setDepartment(department);


    }

    public static void displayEmployee() {

        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public static void addMutiplecompanies() {
        Company company1 = new Company();
        Map<Integer, Company> dictionary = new HashMap<>();
        dictionary.put(1, company1);
        for (Map.Entry<Integer, Company> company : dictionary.entrySet()) {
            System.out.println(company.getKey() + " : " + company.getValue());
        }
    }
}
