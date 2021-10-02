import java.util.Scanner;
public class RotateArray{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 5;
        int[] arr = {1,2,3,4,5};
        int temp = arr[n-1];
        for(int i=n-1;i>0;i--)
        {
            arr[i] = arr[i-1];
        }

        arr[0]= temp;

        for (int i : arr) { 
            System.out.println(i);
        }

        scn.close();
    }
}