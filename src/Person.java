class PersonDemo {
    private String name;
    private int age; 
    public PersonDemo(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name; 
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}
//public class Person {
//    public static void main(String [] args) {
//        PersonDemo p1 = new PersonDemo("Ram Kumar", 12);
//        p1.setName("Rohan Shakya");
//        p1.setAge(21);
//        System.out.println("Name: " + p1.getName());
//        System.out.println("Age: " + p1.getAge());
//    }
//}