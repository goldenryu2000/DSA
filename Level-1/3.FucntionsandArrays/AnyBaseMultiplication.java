import java.util.Scanner;
public class AnyBaseMultiplication{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        System.out.println(getProduct(n1,n2,b));
        scn.close();
    }

    public static int getProduct(int n1,int n2,int b) {
        int pdt = 0;
        int c = 0;
        int tp=1; //powers of 10
        int ttp = 1;
        int p = 0;
        while(c>0)
        {
            int d2 = n2%10;
            n2 = n2/10;
            int temp = n1;
            while(temp > 0)
            {
                int d1 = temp%10;
                temp = temp/10;

                int d = d1*d2 + c;

                c = d/10;
                d = d%10;

                p = p + d*ttp;
                ttp*=10;
            }

            pdt = pdt + p*tp;
            tp*=10;
        }

        return pdt;
        
    }
}