import java.util.Scanner;

public class CountDigitsFunction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(CountDigits(n));
        scn.close();
    }

    public static int CountDigits(int x) {
        int dig = 0;
        while (x != 0) {
            x = x / 10;
            dig++;
        }
        return dig;
    }
}