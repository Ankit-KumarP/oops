// (07/03/2024, 10:45)
// QUES: SHOW ABSTRACTIOIN IN OOPS BY USING INTERFACE.
package oops;

// interface
interface Eating {
    int kg = 32;

    static void special() {
        System.out.println("I am special methode with body bro.");
    }

    default String special2() {
        return "I AM ALSO SPECIAL.";
    }

    void eating();
}

// interface
interface Running {
    double km = 45.7;

    void distance();
}

// class
class Shyam implements Eating, Running {

    
    public void eating() {
       
        System.out.println("Shyam can eat " + Eating.kg + " KG rice.");
    }

    public void distance() {
        System.out.println("After Eating " + Eating.kg + " KG rice, Shyam can run " + Running.km + " KM.");
    }

}

public class Q08abstraction {
    public static void main(String[] args) {
        Shyam sm = new Shyam();
        sm.eating();
        sm.distance();
        Eating.special();
        System.out.println(sm.special2()); 

    }
}