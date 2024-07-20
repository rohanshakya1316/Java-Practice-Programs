class calculator{
    static int do_sum(int x, int y){
        return (x + y);
    }
}

public class ArithmeticOperation {
    static int do_sub(int x, int y){
        return (x - y);
    }
    static int do_mul(int x, int y){
        return (x * y);
    }
    static int do_div(int x, int y){
        return (x / y);
    }
    static int do_mod(int x, int y){
        return (x % y);
    }
    public static void main(String[] args){
        int num1 = 20;
        int num2 = 5;
        int sum = calculator.do_sum(num1, num2);
        System.out.println("Sum = " + sum);
        int diff = do_sub(num1, num2);
        System.out.println("Difference = " + diff);
        int mul = do_mul(num1, num2);
        System.out.println("Product = " + mul);
        int div = do_div(num1, num2);
        System.out.println("Division = " + div);
        int mod = do_mod(num1, num2);
        System.out.println("Modular division = " + mod);
    }
}
