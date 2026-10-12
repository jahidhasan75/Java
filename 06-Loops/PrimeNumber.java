import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        boolean prime = n >= 2;

        for (int i = 2; i <= n / i && prime; i++) {
            if (n % i == 0) prime = false;
        }
        System.out.println(prime ? "Prime" : "Not prime");
        input.close();
    }
}
