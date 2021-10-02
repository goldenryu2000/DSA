import java.util.Scanner;

public class ExtraPattern1{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n =  sc.nextInt();
        int ld=1;
        int rd = 1;
        for(int i=1;i<= 2*n-1;i++)
        {
            for (int j = 1; j <=2*n-1; j++) {
            if(i==j){
            System.out.print(ld+ "\t");  
            if(i<n) ld++;
            else if(i==n){ //to handle when right diagonal meet the left diagonal
                rd--; 
                ld--;
            } 
            else ld--;
            } else if(i+j==2*n){
                System.out.print(rd + "\t");
                if(i<n) rd++;
                else rd--;
            }else{
                System.out.print("\t");
            }
        }
        System.out.println();
        }

        sc.close();
    }
}