// (06/03/2024, 12:37)
// QUES: SHOW ABSTRACTION IN OOPS BY USING ABSRACT CLASS
package oops;

// abstract class
abstract class Dog {

    abstract void run();

    abstract void bark();

    void details() {
        System.out.println("I AM A DOG.");
    }

    void personal() {
        System.out.println("INHERIT ME ONLY IF YOU WANT");
    }

}

// class
class Munchun extends Dog {

    void run() {
        System.out.println("MUNCHUN IS RUNNING.");
    }

    void bark() {
        System.out.println("MUNCHUN IS BARKING");
    }

    void details() {
        super.details();
        System.out.println("MUNCHUN JII IS IN HEAVEN FROM 2017.");
    }
}

public class Q07abstraction {
    public static void main(String[] args) {

        Munchun MunchunJII = new Munchun();
        MunchunJII.run();
        MunchunJII.bark();
        MunchunJII.details();
    }
}