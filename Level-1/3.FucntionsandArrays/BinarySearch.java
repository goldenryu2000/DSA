import java.util.Scanner;
public class BinarySearch{
    public static int binarySearch(int[] a,int x) {
        int low = 0;
        int high = a.length-1;
        int idx = -1;

        while(low<=high)
        {
            int mid = (low+high)/2;

            if(x>a[mid]){
                low = mid+1;
            }else if(x<a[mid]){
                high = mid-1;
            }else{
                idx = mid;
                break;
            } 
        }
        
        return idx;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 10;
        int[] arr = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22};

        System.out.println(binarySearch(arr, 10)); 
        scn.close();
    }
}