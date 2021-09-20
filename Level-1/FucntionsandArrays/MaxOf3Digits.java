import java.util.Scanner;
public class MaxOf3Digits{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        System.out.println(getGreatestThreeDigit(n));




    }

    public static int getGreatestThreeDigit(int n)
    {
        int n1 = n/10;
        int n2 = n%1000;
        int n3 = (n/100)*10 + (n%10);
        int n4 = (n/1000)*100 + (n%100);

        int max = n1;

        if(max<=n2) max = n2;
        
        if(max<=n3) max = n3;
        
        if(max<=n4) max = n4;
        

        return max;
    }
}