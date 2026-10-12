import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        String reversed = new StringBuilder(word).reverse().toString();

        System.out.println(word.equalsIgnoreCase(reversed) ? "Palindrome" : "Not palindrome");
        input.close();
    }
}
