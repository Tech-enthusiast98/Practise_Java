package com.self.stream.Employee.details;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeOperations {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Abraham", 29, "IT", "Mumbai", 20000, "Male"),
                new Employee(2, "Mary", 27, "Sales", "Delhi", 25000, "Female"),
                new Employee(3, "Joe", 28, "IT", "Chennai", 22000, "Male"),
                new Employee(4, "John", 29, "Sales", "Gurgaon", 29000, "Male"),
                new Employee(5, "Liza", 25, "Sales", "Bangalore", 32000, "Female"),
                new Employee(6, "Peter", 27, "Admin", "Mumbai", 31500, "Male"),
                new Employee(7, "Harry", 30, "Research", "Kochi", 21000, "Male")
        );

        System.out.println("Find list of employees whose name starts with alphabet A : ");
        List<Employee> res_employee = employees.stream().filter(emp->emp.getName().startsWith("A")).collect(Collectors.toList());
        System.out.println(res_employee);

        System.out.println("Group The employees By Department Names: ");
        Map<String,List<Employee>> res_department = employees.stream().collect(Collectors.groupingBy(emp -> emp.getDepartName()));
        System.out.println(res_department);

        System.out.println("Find the total count of employees using stream: ");
        long count = employees.stream().count();
        System.out.println(count);

        System.out.println("Find the max age of employees: ");
        long age = employees.stream().mapToInt(emp -> emp.getAge()).max().getAsInt();
        System.out.println(age);

        System.out.println("Find all department names: ");
        List<String> department_name = employees.stream().map(emp -> emp.getDepartName()).collect(Collectors.toList());
        System.out.println(department_name);

        System.out.println("Find the count of employee in each department: ");
        Map<String,Long> count_department = employees.stream().collect(Collectors.groupingBy(Employee::getDepartName, Collectors.counting()));
        System.out.println(count_department);

        System.out.println("Find the list of employees whose age is less than 30: ");
        List<Employee> emp_name = employees.stream().filter(emp -> emp.getAge() < 30).collect(Collectors.toList());
        System.out.println(emp_name);

        System.out.println("Find the list of employees whose age is in between 26 and 31: ");
        List<Employee> ageBetween26And30  = employees.stream().filter(emp -> emp.getAge() > 26 && emp.getAge() <30 ).collect(Collectors.toList());
        System.out.println(ageBetween26And30 );

        System.out.println("Find the average age of male and female employee: ");
        Map<String, Double> avgAgeMap = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(avgAgeMap );

        System.out.println("Find the department who is having maximum number of employee: ");
        Map.Entry<String, Long> department = employees.stream().collect(Collectors.groupingBy
                (Employee::getDepartName, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(department );

        System.out.println("Find the Employee who stays in Delhi and sort them by their names: ");
        List<Employee> emps = employees.stream().filter(emp -> emp.getAddress().equals("Delhi")).sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        System.out.println(emps );

        System.out.println("Find the average salary in all departments: ");
        Map<String, Double> avg = employees.stream().collect(Collectors.groupingBy(Employee::getDepartName, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avg);

        System.out.println("Find the highest salary in each department: ");
        Map<String, Optional<Employee>> largest = employees.stream().collect(Collectors.groupingBy(Employee::getDepartName, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(largest);

        System.out.println("Find the list of employee and sort them by their salary: ");
        List<Employee> employee_sort = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(employee_sort);

        System.out.println("Find the employee who has second lowest salary: ");
        Employee emp = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(1).findFirst().get();
        System.out.println(emp);
    }
}
