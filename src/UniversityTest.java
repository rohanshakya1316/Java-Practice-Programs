class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Student extends Person{
    private int rollNumber;
    private String course ;

    public Student(String name, int age, int rollNumber, String course){
        super(name, age);
        this.rollNumber = rollNumber;
        this.course = course;
    }

    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public int getRollNumber(){
        return rollNumber;
    }

    public String getCourse(){
        return course;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Roll Number: "+rollNumber);
        System.out.println("Course: "+course);
    }
}

class Faculty extends Person{
    private int employeeId;
    private String department;

    public Faculty(String name, int age, int employeeId, String department){
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public String getDepartment(){
        return department;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Department: "+department);
    }
}

public class UniversityTest{
    public static void main(String[] args) {
        Student std1 = new Student("Kamal Thakur", 24,104, "BCA");
        Student std2 = new Student("Hari Kumar", 20,105,"BBM");

        Faculty faculty1 = new Faculty("Ramu",34,201,"DSA");
        Faculty faculty2 = new Faculty("Surendra", 30,202,"OOP");

        System.out.println("Student 1: ");
        std1.displayDetails();
        System.out.println();

        System.out.println("Student 2: ");
        std2.displayDetails();
        System.out.println();

        System.out.println("Faculty 1: ");
        faculty1.displayDetails();
        System.out.println();

        System.out.println("Faculty 2: ");
        faculty2.displayDetails();
    }
}
