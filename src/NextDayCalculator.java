public class NextDayCalculator {

    public static final String CONCAT = "/";

    public static String nextDay(int day, int month, int year){
        return ++day+ CONCAT +month+CONCAT+year;
    }
}
