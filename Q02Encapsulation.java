// (04/03/2024, 15:34)
// QUES: GIVE EXAMPLE OF ENCAPSULATION.
package oops;

// class
class Shape  {
    private String name;
    private int quantity;
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println(this.name);
    }

    public void details() {
        System.out.println("Name : " + this.name);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("ID : " + this.id);
    }

    Shape (String name, int quantity, int id) {
        this.name = name;
        this.quantity = quantity;
        this.id = id;
        System.out.println("PARAMETERIZED CONSTRUCTOR");
    }
}

public class Q02Encapsulation {
    public static void main(String[] args) {
        

        Shape s = new Shape("Triangle",90,0);
        System.out.println(s.getClass());
        s.details();
        s.getName();

    }
}