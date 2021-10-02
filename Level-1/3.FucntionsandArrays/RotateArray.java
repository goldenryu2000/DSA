import java.util.Scanner;

public class RotateArray {

    public static void reverse(int[] arr, int low, int hi) {
        while (low <= hi) {
            int temp = arr[low];
            arr[low] = arr[hi];
            arr[hi] = temp;
            low++;
            hi--;
        }
    }

    public static void rotate(int[] a, int k) {
        // handling k for k>arr.length and k<0
        k = k % a.length;
        if (k < 0)
            k = k + a.length;
        /*
         * Trick is to reverse the two parts individually (1: 0 -> (a.len-k-1) and (2:
         * a.length-k -> a.length-1)) then reverse the whole array
         */
        // main rotate
        // part 1
        reverse(a, 0, a.length - 1 - k);

        // part2
        reverse(a, a.length - k, a.length - 1);

        // whole reverse
        reverse(a, 0, a.length - 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        int k = scn.nextInt();

        rotate(arr, k);

        for (int i : arr) {
            System.out.print(i + "\t");
        }

        scn.close();
    }

}