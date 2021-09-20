import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // finding the largest element since order is not defined of input
        int max = a;
        if (max <= b)
            max = b;
        else if (max <= c)
            max = c;

        // main logic
        if (max == a) {
            if (a * a == (b * b) + (c * c))
                System.out.println("true");
            else
                System.out.println("false");

        } else if (max == b) {
            if (b * b == (a * a) + (c * c))
                System.out.println("true");
            else
                System.out.println("false");
        } else {
            if (c * c == (b * b) + (a * a))
                System.out.println("true");
            else
                System.out.println("false");
        }

        sc.close();
    }
}
