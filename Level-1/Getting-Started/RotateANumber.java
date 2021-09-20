import java.util.Scanner;

public class RotateANumber {
        public static void main(String[] args) {
                
                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();
                int k = sc.nextInt();
                
                // to obtain number of digits
                int temp = n;
                int nod = 0;
                while(temp!=0)
                {
                        temp/=10;
                        nod++;
                }


                //edge cases
                k = k%nod; //if k is greater than nod
                
                if(k<0)  k = k+nod; //if k is negative


                //for divisor and multiplier
                int div =1;
                int mult = 1;
                for(int i=1;i<=nod;i++)
                {
                        if(i<=k) div*=10;
                        else mult*=10;
                }

                
                //create rotated number
                
                int quo = n/div;
                int rem = n%div;
                
                int rot = rem*mult + quo;
                        
                System.out.println(rot);
                
                sc.close();
                }
}
