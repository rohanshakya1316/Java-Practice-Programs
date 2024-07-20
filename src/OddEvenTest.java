import java.util.Scanner;
public class OddEvenTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to check: ");
        int num1 = sc.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("Entered number " + num1 + " is an even number.");
        }
        else {
            System.out.println("Entered number " + num1 + " is a odd number.");
        }
        sc.close();
    }
    
}
