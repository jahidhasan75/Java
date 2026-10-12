public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 15, 16, 23, 42};
        int target = 16;
        int foundAt = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                foundAt = i;
                break;
            }
        }
        System.out.println(foundAt >= 0 ? "Found at index " + foundAt : "Not found");
    }
}
