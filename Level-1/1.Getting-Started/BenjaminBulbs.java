import java.util.Scanner;

public class BenjaminBulbs {

    // Question : The Curious Case of benjamin bulbs -> Pepcoding -> Getting Started
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //trick is that only the perfect primes will be printed as they have ODD number of factors
        for(int i = 1 ; i*i<=n;i++)
        {
            System.out.print((i*i) + "\t");
        }
        sc.close();
    }
}
