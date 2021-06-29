class Shape {
    void Display() {
        System.out.println("this is Shape");
    }
}
class Circle extends Shape {
    void displayCircle() {
        System.out.println("this is Circle");
    }
}
class Reactangle extends Shape {
    void displayReactangle() {
        System.out.println("this is Reactangle");
    }
}
 class Square extends Reactangle {
    void methodRectangle() {
        System.out.println("Square is a rectangle");
    }

}
public class Show {

    public static void main(String[] args) {
        Square sq = new Square();
        sq.methodRectangle();
        sq.displayReactangle();
        sq.Display();

    }

} 