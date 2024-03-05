// (04/03/2024, 17:30)
// QUES: IMPLEMENTS SINGLE, HIERARCHICAL AND MUNTILEVEL INHERITANCE. 
package oops;

// class 1
class Person {
    String name;
    double salary;

    void details() {
        System.out.println("Name :" + this.name);
        System.out.println("Salary : " + this.salary);
    }

    Person() {
        System.out.println("PERSON CONSTRUCTOR");

    }

}

// class 2 // single Inheritance (Teacher -> Person)
class Teacher extends Person {
    String name;
    double salary;
    int id;

    void details() {
        System.out.println("Name :" + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("ID : " + this.id);
    }

    Teacher() {
        System.out.println("TEACHER CONSTRUCTOR");
    }
}

// class 3 // Multilevel inheritence (MathTeacher -> Teacher -> Person)
class MathTeacher extends Teacher {

    void details() {
        System.out.println("Name :" + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("ID : " + this.id);
    }

    MathTeacher() {
        System.out.println("MATH TEACHER CONSTRUCTOR");
    }
}

// class // Hierarchical Inheritance (Engineer and Teacher both are extending
// Person class)
class Engineer extends Person {
    String branch;

    void details() {
        System.out.println("Name :" + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Branch : " + this.branch);
    }

    Engineer(String name, double salary, String branch) {
        this.name = name;
        this.salary = salary;
        this.branch = branch;
        System.out.println("ENGINEER CONSTRUCTOR");
    }
}

public class Q04Inheritance {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Shiv";
        p1.salary = 1000000.4546;
        p1.details();

        Teacher t = new Teacher();
        t.name = "Krishna";
        t.salary = 1000000.867;
        t.id = 109;
        t.details();

        Teacher mt = new MathTeacher();
        t.name = "Ram";
        t.salary = 1000000.867;
        t.id = 110;
        t.details();

        Engineer e = new Engineer("Ankit Kumar", 2000000, "CSIT");
        e.details();

    }
}