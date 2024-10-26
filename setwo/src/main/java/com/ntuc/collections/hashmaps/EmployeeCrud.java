package com.ntuc.collections.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class EmployeeCrud {
    public static void main(String[] args) {
        // create a Map to hold Employee details
        HashMap<Integer, Employee> employees = new HashMap<>();
        // add employees
        employees.put(1000, new Employee("Alice", "Sales"));
        employees.put(1001, new Employee("James", "IT"));
        employees.put(1003, new Employee("David", "Marketing"));
        employees.put(1004, new Employee("Bill", "Sales"));

        // list All employees
        System.out.println("--------------List of all Employees---------------------");
        showMap(employees);

        // retrieve specific employee
        System.out.println("--------------List detail of Employee 1000---------------------");
        System.out.println(employees.get(1000));

        // update an employee
        System.out.println("--------------Update detail of Employee 1000---------------------");
        Employee empToUpdate = employees.get(1000); // getting the employee that is to be updated
        if (employees.containsKey(1000)) { // checking for existence of the employee in the map
            empToUpdate.setName("Jill"); // update the name
            empToUpdate.setDept("IT"); // update the department
        } else {
            System.out.println("Employee does not exist and hence has been created");
        }
        showMap(employees);

        // delete an employee
        System.out.println("--------------delete the detail of Employee 1000---------------------");
        employees.remove(1000);
        showMap(employees);

    }

    static void showMap(HashMap<Integer, Employee> x) {
        for (Map.Entry<Integer, Employee> e : x.entrySet()) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
    }
}
