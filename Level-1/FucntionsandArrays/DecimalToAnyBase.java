import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(n + " in base " + b + " is: " + decimalToAnyBase(n, b));
        scn.close();
    }

    public static int decimalToAnyBase(int n, int b) {
        int ans = 0;
        int tp = 1; // powers of 10
        while (n != 0) {
            int rem = n % b;
            ans = ans + (rem * tp);
            n = n / b;
            tp = tp * 10;
        }

        return ans;
    }
}