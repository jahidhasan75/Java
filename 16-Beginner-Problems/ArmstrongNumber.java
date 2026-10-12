public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        int original = number;
        int digits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, digits);
            number /= 10;
        }
        System.out.println(sum == original ? "Armstrong number" : "Not Armstrong");
    }
}
