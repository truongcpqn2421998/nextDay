public class NextDayCalculator {

    public static final String CONCAT = "/";

    public static String nextDay(int day, int month, int year){
        if(day==31){
            day=1;
            month++;
        }else {
            day++;
        }
        return day+ CONCAT +month+CONCAT+year;
    }
}
