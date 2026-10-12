public class ReverseString {
    public static void main(String[] args) {
        String text = "Java Programming";
        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println(reversed);
    }
}
