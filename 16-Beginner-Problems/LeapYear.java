public class LeapYear {
    public static void main(String[] args) {
        int year = 2028;
        boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        System.out.println(leap ? "Leap year" : "Not a leap year");
    }
}
