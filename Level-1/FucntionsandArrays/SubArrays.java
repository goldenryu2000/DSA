import java.util.Scanner;
public class SubArrays{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i] = scn.nextInt();
        
        for(int si=0;si<n;si++)
            for(int ei=si;ei<n;ei++)
                for(int i=si;i<=ei;i++)
                    System.out.println(i);
        scn.close();
    }
}