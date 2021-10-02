import java.util.Scanner;
public class AnyBaseSubtraction{
    // Condition : n2 > n1
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt(); // note: n2>n1
        if(n1>n2)   System.out.println(getDifference(n2,n1,b));
        else    System.out.println(getDifference(n1,n2,b));
        scn.close();
    }

    public static int getDifference(int n1,int n2,int b) {
        int diff = 0;
        int c = 0; //carry (or borrow) digit
        int tp = 1; //powers of 10

        while(n2>0)
        {
            int d1 = n1%10;
            n1 = n1/10;

            int d2 = n2%10;
            n2 = n2/10;

            int d = d2-c-d1;
            if(d<0){
                c = 1;
                d = d + b;
            }else {
                c = 0;
            }

            diff = diff + d*tp;
            tp*=10;
        }
        return diff;
        
    }
}