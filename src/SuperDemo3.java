// use keyword with constructors
// superclass Person
class Person1 {
    Person1() {
        System.out.println("Person class constructor.");
    }
}
// subclass Student extending Person class
class Student1 extends Person1 {
    Student1() {
        // invoke or call parent class constructor
        super();
        System.out.println("Student class constructor");
    }
}
public class SuperDemo3 {
    public static void main(String[] args) {
        //Student1 s = new Student1();
    }
}
