package projectEmployee;

public class Settings {

    public static long RandomEmployeeNumberGenerator() {
        long min = 000001;
        long max = 999999;
        long range = max - min + 1;
        long employeeID = (long) (Math.random() * range) + min;
        return employeeID;
    }

    public static int PayPeriod() {
        int twoWeeks = 14;
        return twoWeeks;
    }
}
