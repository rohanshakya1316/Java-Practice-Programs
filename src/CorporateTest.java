abstract class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
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
        this.age = age;
    }
    public abstract void displayDetails();
}

class Manager extends Employee {
    private int level;
    private String reportingOfficer;

    public Manager(String name, int age, int level, String reportingOfficer) {
        super(name, age);
        this.level = level;
        this.reportingOfficer = reportingOfficer;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getReportingOfficer() {
        return reportingOfficer;
    }

    public void setReportingOfficer(String reportingOfficer) {
        this.reportingOfficer = reportingOfficer;
    }

    @Override
    public void displayDetails() {
        System.out.println("Manager Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Level: " + level);
        System.out.println("Reporting Officer: " + reportingOfficer);
    }
}

class SalesPerson extends Employee {
    private int salesId;
    private String product;

    public SalesPerson(String name, int age, int salesId, String product) {
        super(name, age);
        this.salesId = salesId;
        this.product = product;
    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public void displayDetails() {
        System.out.println("SalesPerson Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Sales ID: " + salesId);
        System.out.println("Product: " + product);
    }
}

public class CorporateTest {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Ram", 45, 1, "Hari");
        Manager manager2 = new Manager("Sita", 37, 2, "Gita");

        SalesPerson salesPerson1 = new SalesPerson("Karn", 50, 3301, "Computer Tech");
        SalesPerson salesPerson2 = new SalesPerson("Arjun", 28, 3102, "Plumbing");

        System.out.println("Manager 1 Details:");
        manager1.displayDetails();
        System.out.println();

        System.out.println("Manager 2 Details:");
        manager2.displayDetails();
        System.out.println();

        System.out.println("SalesPerson 1 Details:");
        salesPerson1.displayDetails();
        System.out.println();

        System.out.println("SalesPerson 2 Details:");
        salesPerson2.displayDetails();
    }
}
