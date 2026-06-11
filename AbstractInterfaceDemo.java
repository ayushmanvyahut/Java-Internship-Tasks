interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Square implements Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }
}

abstract class Polygon {
    abstract int getNumberOfSides();
}

class Triangle extends Polygon {
    int getNumberOfSides() {
        return 3;
    }
}

class Pentagon extends Polygon {
    int getNumberOfSides() {
        return 5;
    }
}

public class AbstractInterfaceDemo {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape square = new Square(4);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Square Perimeter: " + square.calculatePerimeter());

        Polygon triangle = new Triangle();
        Polygon pentagon = new Pentagon();

        System.out.println("Triangle sides: " + triangle.getNumberOfSides());
        System.out.println("Pentagon sides: " + pentagon.getNumberOfSides());
    }
}