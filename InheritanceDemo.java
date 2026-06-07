class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow Meow!");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        Animal[] animals = {
            new Dog("Tommy", 3),
            new Cat("Kitty", 2)
        };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
