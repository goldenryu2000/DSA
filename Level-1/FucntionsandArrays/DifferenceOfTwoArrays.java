import java.util.Scanner;

public class DifferenceOfTwoArrays {
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

        // Difference array
        int[] diff = new int[n2]; // coz in question it is mentioned that n2 > n1 always

        // variables to traverse through arrays
        int i = one.length - 1;
        int j = two.length - 1;
        int k = diff.length - 1;
        int c = 0;

        while (k >= 0) {
            int d = two[j] - c;

            if (i >= 0)
                d = d - one[i];

            if (d < 0) {
                d = d + 10;
                c = 1;
            } else {
                c = 0;
            }

            diff[k] = d;

            i--;
            j--;
            k--;
        }

        //don't print the leading zeroes
        int idx = 0;
        //finding out the index where leading zeroes end
        while(idx<diff.length){
            if(diff[idx]!=0)
                break;
            else    
                idx++;
        }

        //printing from idx
        while(idx<diff.length){
            System.out.println(diff[idx]);
            idx++;
        }
        scn.close();
    }
}