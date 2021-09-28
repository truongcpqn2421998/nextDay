public class NextDayCalculator {

    public static final String CONCAT = "/";
    public static final int END_OF_MONTH2_IN_LEAP_YEAR = 29;
    public static final int END_OF_MONTH2_IN_NORMAL_YEAR = 28;

    public static String nextDay(int day, int month, int year){
        int endOfMonth = getEndOfMonth(month,year);
        int startOfMonth = 1;
        if(day== endOfMonth){
            day= startOfMonth;
            month++;
        }else {
            day++;
        }
        return day+ CONCAT +month+CONCAT+year;
    }

    private static int getEndOfMonth(int month,int year) {
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
            case 4:
            case 6:
            case 9:
            case 11:
                endOfMonth=30;
                break;
            case 2:
                endOfMonth = getEndOfMonth2(year);
                break;
        }
        return endOfMonth;
    }

    private static int getEndOfMonth2(int year) {
        int endOfMonth2;
        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;
        if(isDivisibleBy4){
            if(isDivisibleBy100){
                if(isDivisibleBy400){
                    endOfMonth2= END_OF_MONTH2_IN_LEAP_YEAR;
                }else {
                    endOfMonth2= END_OF_MONTH2_IN_NORMAL_YEAR;
                }
            }else {
                endOfMonth2=END_OF_MONTH2_IN_LEAP_YEAR;
            }
        }else {
            endOfMonth2=END_OF_MONTH2_IN_NORMAL_YEAR;
        }
        return endOfMonth2;
    }
}
