// (06/03/2024, 11:38)
// QUESTION: USE STATIC KEYWORD TO CREATE METHODE AND VARIBLE OF CLASS AND USE INHERITENCE ON IT.
package oops;

// class
class Employee {
    int salary;
    static int id;
    final int count = 14;

    static void details() {
        System.out.println(Employee.id);
        System.out.println("STATIC FUNCTION");
    }

    static void details(int id) {
        System.out.println("NON STATIC OVERLOADING");
    }

    Employee(int salary, int id) {
        this.salary = salary;
        this.id = id;
    }

}

// class 2
class Atlassian extends Employee {

    static void details() {
        System.out.println("CHILD CLASS METHODE");
    }

    Atlassian() {
        super(25000000, 67);
        System.out.println("ATLASSIAN CONCTRUCTOR");

    }
}

public class Q06static {
    public static void main(String[] args) {
        // Employee.id = 6;
        // Employee.details();

        Employee e = new Employee(2000000, 14);
        // e.details();
        // e.id = 90;
        Employee.details();

        Atlassian a = new Atlassian();
        Employee.details();
        System.out.println(e.salary);

    }
}