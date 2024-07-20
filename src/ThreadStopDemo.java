import static java.lang.Thread.sleep;

class ThreadA extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("ThreadA is running: " + i);
            if (i == 3){
                stop();
            }
        }
        System.out.println("Exit from ThreadA.");
    }
}

class ThreadB implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("ThreadB is running: " + i);
            if (i == 3) {
                try {
                    sleep(1000);
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        }
        System.out.println("Exit from ThreadB.");

    }
}
public class ThreadStopDemo {
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        t1.start();
        Thread t2 = new Thread(new ThreadB());
        t2.start();

    }
}
