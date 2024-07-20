class Animal {
    public void eat() {
        System.out.println("The animal is eating food.");
    }
}
public class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // inherited method
        myDog.bark(); // specific to Dog
        Animal myDog2 = new Dog();
        myDog2.eat();
       // myDog2.bark ... // will generate error as myDog2 is object of animal class.

    }
}



