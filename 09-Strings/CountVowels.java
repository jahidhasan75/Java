public class CountVowels {
    public static void main(String[] args) {
        String text = "Java is fun".toLowerCase();
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if ("aeiou".indexOf(ch) >= 0) count++;
        }
        System.out.println("Vowel count = " + count);
    }
}
