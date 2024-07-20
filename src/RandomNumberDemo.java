import java.util.Random;
public class RandomNumberDemo {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i <= 5; i++) {
            int n = rand.nextInt(50);
            double b = rand.nextDouble(10);
            byte[] d = new byte[1];
            rand.nextBytes(d);
            byte num = d[0];
            
            System.out.println("The random byte number is " + num);
            System.out.println("The random int number is " + n);
            System.out.printf("The random byte number is %.2f.\n", b);    
        }
        
    }
}
