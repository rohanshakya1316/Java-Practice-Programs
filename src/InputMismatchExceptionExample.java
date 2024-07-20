import java.util.Scanner;
import java.util.InputMismatchException;

class NonPositiveNumberException extends Exception {
    NonPositiveNumberException(String str) {
    super(str);
 }
}
class MyThread implements Runnable {
 private int N;

 MyThread(int N) {
  this.N = N;
 }
 @Override
 public void run() {
  Scanner scanner = new Scanner(System.in);
  int[] numbers = new int[N];
  double average = 0;
  System.out.printf("Enter the %d numbers one by one\n", N);
  for(int i = 0; i<N; ++i) {
   numbers[i] = scanner.nextInt();
  }
  for(int i = 0; i<N ; ++i) {
   average += numbers[i];
  }
  average = average / N;
  System.out.println("The average is: " + average);
 }
}

public class InputMismatchExceptionExample {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int N = 0;
  try {
   System.out.print("Enter the size:");
   N = scanner.nextInt();
   if(N < 0) {
    throw new NonPositiveNumberException("Enter the positive number");
   }
  }catch(InputMismatchException ime) {
   System.out.println("Incorrect type, try again...");
  }catch(NonPositiveNumberException npe) {
   System.out.println(npe.getMessage());
  }

  MyThread p = new MyThread(N);
  Thread t = new Thread(p);
  t.start();
  scanner.close();
 }
}
