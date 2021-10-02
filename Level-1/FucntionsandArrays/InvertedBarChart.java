import java.util.Scanner;

public class InvertedBarChart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int max = arr[0];
        // finding the max element
        for (int i : arr) {
            if (i > max)
                max = i;
        }

        int ht = 1;
        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= ht)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            ht++;
            System.out.println();
        }

        scn.close();
    }
}