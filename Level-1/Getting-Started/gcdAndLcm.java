import java.util.Scanner;

public class gcdAndLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
     
        int tn1 = n1;
        int tn2 = n2;
        
        //to find gcd
        
        while(tn1%tn2!=0)
        {
            int r = tn1%tn2;
            
            tn1 = tn2;
            tn2 = r;
        }
        
        //printing gcd
        System.out.println(tn2);
        
        //for lcm using the formula ==> lcm*gcd = n1*n2
        
        System.out.println((n1*n2)/tn2);

        sc.close();
    }
}
