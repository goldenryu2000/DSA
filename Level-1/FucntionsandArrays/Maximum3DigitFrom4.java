import java.util.Scanner;

public class Maximum3DigitFrom4 {
    // My implementation for a maximum 3 digit number from a 4 digit number.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int n1 = n / 10;
        int n2 = n % 1000;
        int n3 = (n / 100) * 10 + (n % 10);
        int n4 = (n % 100) + (n / 1000) * 100;

        System.out
                .println(((n1 > n2) ? n1 : n2) > ((n3 > n4) ? n3 : n4) ? ((n1 > n2) ? n1 : n2) : ((n3 > n4) ? n3 : n4));
        // this above expression in print statement is nothing but:
        // Math.max(Math.max(n1,n2),Mat.max(n3,n4));

        scn.close();
    }
}