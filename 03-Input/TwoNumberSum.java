import java.util.Scanner;

public class TwoNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Sum = " + (a + b));
        input.close();
    }
}
