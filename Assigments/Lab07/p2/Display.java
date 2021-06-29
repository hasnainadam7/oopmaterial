
//for getting values by user importing complete util libarary or only scanner libary
import java.util.*;


//Abstract Class & Method
//for Getting Percentage 
abstract class Marks {
    abstract double getPercentage();
}

// class A for 1st studnet
class A extends Marks {
    // Data Stoarge Variables (floats)
    private float urdu, math, islamiat;

    // Method for storing variable's values
    public A(float a, float b, float c) {
        urdu = a;
        math = b;
        islamiat = c;
    }

    // calculatin % of this 3 subjects
    double getPercentage() {
        float percentOF_A = ((urdu + math + islamiat) / 3);
        return percentOF_A;
    }
}

// class B for 2nd student
class B extends Marks {
    // Data Stoarge Variables (floats)
    private float english, chemistry, phyiscs, socialStudies;

    // Method for storing variable's values
    public B(float a, float b, float c, float d) {
        english = a;
        chemistry = b;
        phyiscs = c;
        socialStudies = d;
    }

    double getPercentage() {
        float percentage_Of_B = ((english + chemistry + phyiscs + socialStudies) / 4);

        return percentage_Of_B;
    }
}

// class with main method
class Displaying {
    public static void main(String[] args) {
        System.out.println("Decription \n~Kindly Avoid Symbols and Alphabets during enter the result ");

        Scanner sc = new Scanner(System.in);
        float subject1 = 0, subject2 = 0, subject3 = 0, subject4 = 0;
        System.out.println("Enter The Marks OF Student A");

        // values of A in object
        System.out.print("For Urdu :");
        subject1 = sc.nextFloat();
        System.out.print("\nFor Math :");
        subject2 = sc.nextFloat();
        System.out.print("\nFor Islmiat :");
        subject3 = sc.nextFloat();

        A a = new A(subject1, subject2, subject3);
        double percenta_A = a.getPercentage();
        System.out.println("\nEnter The Marks OF Student B");
        // values of B in object
        System.out.print("\nFor English :");
        subject1 = sc.nextFloat();
        System.out.print("\nFor Chemistry :");
        subject2 = sc.nextFloat();
        System.out.print("\nFor Physics :");
        subject3 = sc.nextFloat();
        System.out.print("\nFor Social Studies :");
        subject4 = sc.nextFloat();
        B b = new B(subject1, subject2, subject3, subject4);
        double percenta_B = b.getPercentage();
        // Displaying Percentage
        System.out.println("Percentage OF Students");
        System.out.println("A : " + percenta_A);
        System.out.println("B : " + percenta_B);
    }
}