// use of super with variables
// Base class vehicle
class Vehicle {
    int maxSpeed = 100;
}

// sub class Car extending vehicle
class Car extends Vehicle {
    int maxSpeed = 140;

    void display() {
        // print maxSpeed of base class (Vehicle)
        System.out.println("Max Speed: " + super.maxSpeed);
    }
}
public class SuperDemo1 {
    public static void main(String[] args) {
        Car A = new Car();
        A.display();
    }
}
