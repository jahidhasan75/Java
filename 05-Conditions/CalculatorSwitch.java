import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number, operator (+ - * /), second number: ");
        double a = input.nextDouble();
        char operator = input.next().charAt(0);
        double b = input.nextDouble();

        switch (operator) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/':
                if (b == 0) System.out.println("Cannot divide by zero");
                else System.out.println(a / b);
                break;
            default: System.out.println("Unknown operator");
        }
        input.close();
    }
}
