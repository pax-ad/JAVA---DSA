package OOPs;

public class Abstract {

    public static void main(String[] args) {

        Horse h = new Horse();
        h.eat();
        h.walk();
        h.changeColor();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.walk();
        c.changeColor();
        System.out.println(c.color);
    }
}

abstract class Animal {

    String color;

    Animal() {
        color = "Brown";
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("Eating...");
    }

    abstract void walk(); //we don't know how animal will walk, so we are not providing the body of the function, we are just declaring it. The body will be provided by the child class.

    abstract void changeColor();
}

class Horse extends Animal {

    @Override
    void walk() {
        System.out.println("Walks on 4 legs");
    }

    @Override
    void changeColor() {
        color = "Black";
    }
}

class Chicken extends Animal {

    @Override
    void walk() {
        System.out.println("Walks on 2 legs");
    }

    @Override
    void changeColor() {
        color = "White";
    }
}