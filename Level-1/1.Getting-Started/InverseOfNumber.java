import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        // Inverse Of a Number Question From Pepcoding Level-1  -> Getting Started

        int inv = 0;
        int p = 1; // for position in the inverse number
        while(n!=0)
        {
            int r = n%10;
            int q = n/10;

            // r @ p -> p @ r --> p * pow(10,r-1)
            inv = inv + p * (int)Math.pow(10, r-1);

            n = q;
            p++;
        }

        System.out.println(inv);

        sc.close();
       }
}
