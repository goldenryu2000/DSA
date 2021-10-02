import java.util.Scanner;

public class CountDigitFrequenct {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        System.out.println(countDigitFrequency(n, d));
        scn.close();
    }

    public static int countDigitFrequency(int n, int d) {
        int f = 0;

        while (n != 0) {
            int rem = n % 10;
            if (rem == d)
                f++;
            n = n / 10;
        }
        return f;

    }
}