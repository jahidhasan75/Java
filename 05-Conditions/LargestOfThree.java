import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();

        int largest = Math.max(a, Math.max(b, c));
        System.out.println("Largest = " + largest);
        input.close();
    }
}
