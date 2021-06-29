import java.util.*;

class Rectangle {
    int length;
    int breadth;

    public Rectangle(int a, int b) {
        length = a;
        breadth = b;
    }

    public void printArea() {
        System.out.println(length * breadth);
    }

    public void printPerimeter() {
        System.out.println(2 * (length + breadth));
    }
}

class Square extends Rectangle {
    int side;

    public Square(int a,int b ) {
        super(a, b);
    }
}

class Dsiplay {
    public static void main(String[] args) {
        int lenght , breadth;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Lenght : ");
        lenght = sc.nextInt();
        System.out.printf("\nEnter Breath : ");
        breadth = sc.nextInt();
       
        Rectangle r = new Rectangle(lenght, breadth);
        r.printArea();
        r.printPerimeter();

        Square s = new Square(lenght,breadth);
        s.printArea();
        s.printPerimeter();

    }
}