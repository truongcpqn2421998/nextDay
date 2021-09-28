public class NextDayCalculator {

    public static final String CONCAT = "/";

    public static String nextDay(int day, int month, int year){
        int endOfMonth = getEndOfMonth(month);
        int startOfMonth = 1;
        if(day== endOfMonth){
            day= startOfMonth;
            month++;
        }else {
            day++;
        }
        return day+ CONCAT +month+CONCAT+year;
    }

    private static int getEndOfMonth(int month) {
        int endOfMonth = 0;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                endOfMonth=31;
                break;
            case 2:
            case 4:
            case 6:
            case 9:
            case 11:
                endOfMonth=30;
                break;
        }
        return endOfMonth;
    }
}
