public class Company {

    static String name;
    static float salary;

    static void set(String n, float p) {
        name  = n;
        salary  = p;
    }

    static void get() {
        System.out.println("Name is: " + name );
        System.out.println("Salary is: " + salary);
    }

    public static void main(String args[]) {
        Company.set("Rohan Shakya", 15000.55f);
        Company.get();
    }
}
