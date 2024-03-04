// (04/03/2024, 17:30)
// QUES: IMPLEMENTS SINGLE, HIRARICAL AND MUNTILEVEL INHERITANCE.
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

// class 2
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

// class 3
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

public class Q04Inheritence {
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

        MathTeacher mt = new MathTeacher();
        t.name = "Ram";
        t.salary = 1000000.867;
        t.id = 110;
        t.details();

    }
}