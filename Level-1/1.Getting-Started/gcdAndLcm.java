import java.util.Scanner;

public class gcdAndLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
     
        // creating temp variabes for gcd operations
        int tn1 = n1;
        int tn2 = n2;

        while(tn1%tn2 !=0)
        {
            int rem  = tn1%tn2;

            //updating the values
            tn1 = tn2;
            tn2  = rem;
        }

        int gcd = tn2;

        // for LCM  --> gcd * lcm == n1*n2

        int lcm = (n1*n2)/gcd;

        System.out.println("gcd: " + gcd);
        System.out.println("lcm: " + lcm);

        sc.close();
    }
}
