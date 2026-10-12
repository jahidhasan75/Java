public class TypeCasting {
    public static void main(String[] args) {
        int number = 10;
        double widened = number;       // Widening: automatic
        double price = 19.99;
        int narrowed = (int) price;    // Narrowing: explicit

        System.out.println(widened);
        System.out.println(narrowed);  // Decimal part is removed
    }
}
