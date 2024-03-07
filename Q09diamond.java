// (07/03/2024, 11:27)
// QUES: WRITE CODE FOR DIAMOND PROBLEM AND  ITS SOLUTION.
package oops;

// RBI
interface RBI {
    String name = "RBI";

    default  void details() {
        System.out.println("I AM TOPPER");
    }
}

// SBI
interface SBI extends RBI {
    String name = "SBI";
}

// PNB
interface PNB extends RBI {
    String name = "PNB";
}

// HDFC
class HDFC implements PNB, SBI {
    String name = "HDFC";

     void about() {
        details();
    }
}

public class Q09diamond {
    public static void main(String[] args) {

    }
}