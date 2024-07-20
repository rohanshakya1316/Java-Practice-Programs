import java.util.Scanner;
public class AreaOfCircle {
    static double CalculateArea(double r){
        return (Math.PI * Math.pow(r, 2));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = s.nextDouble();
        double area;
        area = CalculateArea(radius); 
        System.out.println("The area of the circle is " + area + ".");
        s.close();
    }
}
