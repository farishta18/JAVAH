package GroupWoek2;

public class SquareTest {
    public static void main(String[] args) {

            Circle circle = new Circle(5.0);
            System.out.println("Circle Area: " + circle.calculateArea());
            System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

            Square square = new Square(4.0);
            System.out.println("Square Area: " + square.calculateArea());
            System.out.println("Square Perimeter: " + square.calculatePerimeter());
        }
    }

