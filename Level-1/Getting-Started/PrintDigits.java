import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // To find the divisor
        int temp = n;
        int div = 1;
        while(temp>=10)
        {
            div*=10;
            temp/=10;
        }

        //main Loop
        while(div>=1)
        {
            System.out.println(n/div);
            n = n%div;
            div/=10;
        }
        sc.close();
    }
}
