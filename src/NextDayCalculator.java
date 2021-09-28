public class NextDayCalculator {

    public static final String CONCAT = "/";

    public static String nextDay(int day, int month, int year){
        int endOfMonth = 31;
        int startOfMonth = 1;
        if(day== endOfMonth){
            day= startOfMonth;
            month++;
        }else {
            day++;
        }
        return day+ CONCAT +month+CONCAT+year;
    }
}
