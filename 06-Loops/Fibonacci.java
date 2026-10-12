import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many terms (1-92)? ");
        int n = input.nextInt();

        if (n < 1 || n > 92) {
            System.out.println("Enter a number from 1 to 92.");
        } else {
            long first = 0, second = 1;
            for (int i = 0; i < n; i++) {
                System.out.print(first + (i + 1 == n ? "" : " "));
                long next = first + second;
                first = second;
                second = next;
            }
            System.out.println();
        }
        input.close();
    }
}
