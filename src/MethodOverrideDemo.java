// parent class Fruit
class Fruit {
    // Attributes
    protected String name;
    protected String taste;
    protected String size;
    // Constructor
    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    // Method to describe eating the fruit
    public void eat() {
        System.out.println("Consuming " + size + name + "which tastes " + taste);
    }
}

// subclass Apple
class Apple extends Fruit {
    //Constructor
    public Apple(String name, String taste, String size) {
       // Call superclass constructor using super()
        super(name, taste, size);
    }
    @Override
    // override eat() method to represent Apple's taste
    public void eat() {
        System.out.println("Consuming " + size + " " + name + " which tastes sweet and crunchy.");
    }
}
// subclass Orange
class Orange extends Fruit {
    // constructor
    public Orange(String name, String taste, String size) {
        // Call superclass constructor using super()
        super(name, taste, size);
    }
    // Override eat() method to represent Orange's taste
    @Override
    public void eat() {
        System.out.println("Consuming " + size + " " + name + " which tastes tangy and juicy.");
    }
}

public class MethodOverrideDemo {
    public static void main(String[] args) {
        // create instances of Apple and Orange
        Apple apple = new Apple("apple", "sweet", "small");
        Orange orange = new Orange("orange", "juicy", "medium");

        // Call eat() method for each fruit
        apple.eat();
        orange.eat();
    }
}

