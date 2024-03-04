// (04/03/2024, 14:57)
// QUES: GIVE EXAMPLE OF ALL TYPES OF CONSTRUCTOR.
package oops;

// class 1
class Shape1 {
    String name;
    int quantity;

    public void details() {
        System.out.println("Name : " + this.name);
        System.out.println("Quantity : " + this.quantity);
    }

    Shape1() {
        System.out.println("DEFAULT CONSTRUCTOR");
    }
}

// class 2
class Shape2 {
    String name;
    int quantity;

    public void details() {
        System.out.println("Name : " + this.name);
        System.out.println("Quantity : " + this.quantity);
    }

    Shape2(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        System.out.println("PARAMETERIZED CONSTRUCTOR");
    }
}

// class 3
class Shape3 {
    String name;
    int quantity;

    public void details() {
        System.out.println("Name : " + this.name);
        System.out.println("Quantity : " + this.quantity);
    }

    Shape3(Shape1 s1) {
        this.name = s1.name;
        this.quantity = s1.quantity;
        System.out.println("COPY CONSTRUCTOR");
    }
}

public class Q01Constructor {
    public static void main(String[] args) {
        Shape1 s1 = new Shape1();
        s1.name = "Circle";
        s1.quantity = 24;
        s1.details();

        Shape2 s2 = new Shape2("Square",24);
        s2.details();

        Shape3 s3 = new Shape3(s1);
        s3.details();
        System.out.println("Hlo");
    }
}