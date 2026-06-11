class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Vehicle {
    void startEngine() {
        System.out.println("Vehicle engine started.");
    }
}

class Car extends Vehicle {

    @Override
    void startEngine() {
        System.out.println("Car engine started with key ignition.");
    }
}

public class OverloadingOverridingDemo {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Sum of 2 numbers: " + calc.add(10, 20));
        System.out.println("Sum of 3 numbers: " + calc.add(10, 20, 30));

        Vehicle vehicle = new Vehicle();
        vehicle.startEngine();

        Car car = new Car();
        car.startEngine();
    }
}