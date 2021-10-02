import java.util.Scanner;

public class TwoArraySum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // input array 1
        int n1 = scn.nextInt();
        int[] one = new int[n1];
        for (int i = 0; i < one.length; i++)
            one[i] = scn.nextInt();

        // input array 2
        int n2 = scn.nextInt();
        int[] two = new int[n2];
        for (int i = 0; i < two.length; i++)
            two[i] = scn.nextInt();

        // sum array
        int[] sum = new int[n2 > n1 ? n2 : n1];

        // variables to traverse through arrays
        int i = one.length - 1;
        int j = two.length - 1;
        int k = sum.length - 1;
        int c = 0;

        while (k >= 0) {
            int d = c;

            if (i >= 0)
                d = d + one[i];

            if (j >= 0)
                d = d + two[j];

            c = d / 10;
            d = d % 10;

            sum[k] = d;
            i--;
            j--;
            k--;
        }

        // handling if carry is still left
        if (c > 0)
            System.out.println(c);

        for (int l : sum) {
            System.out.println(l);
        }

        scn.close();
    }
}