// (05/03/2024, 16:55)
// QUES: WRITE CODE FOR MUNTIPLE INHERITANCE IN JAVA.
package oops;

// Interface 1
interface Wheel {
    int number = 2;

    void wheelDetails();
}

// Interface 2
interface Wings {
    String diameter = "90cm";

    void wingsDetails();
}

// class // Muntiple inhertance (Helicopter class extends both Wheel and Wings
// Intrface)
class Helicopter implements Wheel, Wings {
    String diameter = "90cm";

    public void wheelDetails() {
        System.out.println("FROM WHEEL INTERFACE");
        System.out.println("Number : " + Wheel.number);
    }

    public void wingsDetails() {
        System.out.println("FROM WINGS INTERFACE");
        System.out.println("Diameter : " + this.diameter);
    }
}

public class Q05Inheritance {
    public static void main(String[] args) {

        Helicopter h = new Helicopter();
        h.wheelDetails();
        h.wingsDetails();
    }

}