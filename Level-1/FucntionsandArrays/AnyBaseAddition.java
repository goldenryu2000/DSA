import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int b = scn.nextInt();
        System.out.println("Sum of " + n1 + " & " + n2 + " in base " + b + " is:  " + getSum(n1, n2, b));
        scn.close();
    }

    public static int getSum(int n1, int n2, int b) {
        int sum = 0;
        int c = 0; // carry variable
        int tp = 1; // powers of 10

        while (n1 >= 0 || n2 > 0 || c > 0) {
            int d1 = n1 % 10; // taking a digit out of n1
            n1 = n1 / 10;
            int d2 = n2 % 10; // taking a digit out of n2
            n2 = n2 / 10;

            int d = d1 + d2 + c; // creating the digit for sum

            c = d / b; // updating carry
            d = d % b; // updating digit

            sum = sum + d * tp; // adding digit to sum at the right place
            tp *= 10; // updating power of ten
        }
        return sum;
    }
}