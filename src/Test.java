// class SuperClass {
//     void myMethod() {
//         System.out.println("A");
//     }
// }

// class SubClass extends SuperClass {
//     void myMethod() {
//         System.out.println("A");
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         SuperClass obj = new SubClass();
//         obj.myMethod();
//     }
// }

class A {
    A() {
        System.out.print("2");
    }
}

class B extends A {
    B() {
        System.out.print("1"); 
    }
    
    public static void main(String[] args) {
        System.out.print("3");
        B o = new B();
    }
}
