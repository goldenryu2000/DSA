import java.util.Scanner;

public class ExtraPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nval = 1;


    for(int i=1;i<=2*n+1;i++)
    {       int val = 1;
        if(i==1 || i==n*2+1) System.out.println("*\t");
        else
        {
            System.out.print("*\t");

            for(int j =1;j<=nval;j++)
            {
                if(j<=nval/2){
                    System.out.print(val + "\t");
                    val++;
                }else{
                    System.out.print(val + "\t");
                    val--;
                }
            }
            System.out.print("*\t");

            //updating nval
            if(i<=n) nval+=2;
            else nval-=2;
            System.out.println();
        }
    }

        sc.close();
    }
}
