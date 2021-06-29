import java.util.*;

public class TaskOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first value");
        int val1 = Integer.parseInt(sc.nextLine());
        System.out.println("Select Which Artimetic operation do u want to perform\n");
        System.out.println("1)for Addition press 1 & enter");
        System.out.println("2)for Subtraction type 2 & enter");
        System.out.println("3)for Multiplication type 3 & enter");
        System.out.println("4)for division type 4 & enter");
        int sign = Integer.parseInt(sc.nextLine());
        System.out.println("Input 2nd value");
        int val2 = Integer.parseInt(sc.nextLine());
        switch (sign) {
        case 1: {
            System.out.println(val1 + " + " + val2 + " = " + (val1 + val2));
            break;
        }

        case 2: {
            System.out.println(val1 + " - " + val2 + " = " + (val1 - val2));
            break;
        }
        case 3: {
            System.out.println(val1 + " * " + val2 + " = " + (val1 * val2));
            break;
        }
        case 4: {
            System.out.println(val1 + " / " + val2 + " = " + (val1 / val2));
            break;
        }
        }

    }
}