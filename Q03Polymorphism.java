// (04/03/2024, 16:17)
// QUES: GIVE EXAMPLE OF ENCAPSULATION.
package oops;

// class
class Polymorphism{
    int id;
    String name;

    void details(){
        System.out.println("N0 PARAMETER");
    }
    void details(int id){
        System.out.println("ID : "+this.id);
        System.out.println("INTEGER AS PARAMETER");
    }
    void details(String name){
        System.out.println("Name: "+this.name);
        System.out.println("STRING AS PARAMETER");
    }
    void details(String name, int id){
        this.name = name;
        this.id = id;
        System.out.println("Name: "+this.name);
        System.out.println("ID : "+this.id);
        System.out.println("STRING, INTEGER AS PARAMETER");
    }
    void details(int id, String name){
        System.out.println("ID : "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("INTEGER, STRING AS PARAMETER");
    }

    Polymorphism(int id, String name){
        this.id = id;
        this.name = name;
    }

}
public class Q03Polymorphism{
    public static void main(String [] args){

    Polymorphism p = new Polymorphism(101,"Poly");
    p.details();
    p.details(0);
    p.details("0");
    p.details(0,"0");
    p.details("Changed",2002);
    }
}