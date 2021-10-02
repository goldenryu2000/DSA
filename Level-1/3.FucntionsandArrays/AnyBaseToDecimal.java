import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(n + " in base " + b + " is: " + anyBaseToDecimal(n, b));
        scn.close();
    }

    public static int anyBaseToDecimal(int n, int b) {
        int ans = 0;
        int pb = 1; // powers of base
        while (n != 0) {
            int rem = n % 10;
            ans = ans + (rem * pb);
            n = n / 10;
            pb = pb * b;
        }
        return ans;
    }
}