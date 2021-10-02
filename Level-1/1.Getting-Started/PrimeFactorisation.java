import java.util.Scanner;

//  Printing all the Prime Factors of a Number
public class PrimeFactorisation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int f = 2; f * f <= n; f++) {
            while (n % f == 0) {
                System.out.print(f + "\t");
                n = n / f;
            }
        }

        if (n > 1) // for edge cases like n = 46
        {
            System.out.print(n);
        }

        sc.close();
    }
}
