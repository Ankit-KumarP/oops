// (25/02/2024)
//QUES: WRITE CODE FOR DIAMOND PROBLEM
package oops;

// RBI
interface RBI {
    String name = "RBI";

    default void details() {
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
        PNB.super.details();
        SBI.super.details();
    }
}

public interface Q01DiamondProblem {
    public static void main(String[] args) {
        HDFC bank1 = new HDFC();
        bank1.about();
    }
}
