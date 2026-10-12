public class NumberReversal {
    public static void main(String[] args) {
        int number = 12345;
        int reversed = 0;

        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        System.out.println("Reversed = " + reversed);
    }
}
