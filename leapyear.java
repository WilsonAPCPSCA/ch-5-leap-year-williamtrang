public class leapyear {
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            System.out.println("Reenter a year.");
            return false;
        }
        if (year %4 == 0 && (year %100 != 0 || year % 400 == 0)) {
            return true;
        }
        else if (year % 4 == 0 && year%100 != 0) {
            return true;
        }
        else {
            return false;
        }
    }
}