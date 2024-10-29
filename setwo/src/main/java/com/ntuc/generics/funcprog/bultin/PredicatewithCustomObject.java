package com.ntuc.generics.funcprog.bultin;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicatewithCustomObject {
    public static void main(String[] args) {
        Predicate<Employee> AreOldEmployeesPresent = e -> e.getAge() > 50;
        boolean res = getEmployees().anyMatch(AreOldEmployeesPresent);
        System.out.println(res ? "Old Employees Present" : "No older employees");

    }

    static Stream<Employee> getEmployees() {
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(10, "Alex", 35, 9000.6f));
        empList.add(new Employee(11, "Alice", 25, 5000.5f));
        empList.add(new Employee(12, "Tan", 65, 3000.4f));
        empList.add(new Employee(13, "Tim", 75, 6000.3f));

        return empList.stream();
    }
}
