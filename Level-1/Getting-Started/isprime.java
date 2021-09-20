import java.util.Scanner;

public class isprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int div = 2; div*div<=n; div++)
        {
            if(n%div==0)
            {
                isPrime = false;
                break;
            }
        }

        if(isPrime) System.out.println("Prime");
        else System.out.println("Not Prime");
        
        sc.close();
    }
}
