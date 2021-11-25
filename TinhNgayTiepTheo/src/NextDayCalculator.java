public class NextDayCalculator {

    public static final String CONNECTION = "/";
    public static final int SPECIALMONTH= 2;
    public static final int ENDOFYEAR= 12;
    public static final int FIRSTOFYEAR= 1;


    public static String getNextDay(int day, int month, int year){
        int endOfMonth = getLastOfMonth(month,year);
        int firstOfMonth = 1;
        if (day== endOfMonth && month== ENDOFYEAR){
            day= firstOfMonth;
            month= FIRSTOFYEAR;
            year++;
        }else if (day== endOfMonth && month == SPECIALMONTH){
            day= firstOfMonth;
            month++;
        } else if (day == endOfMonth){
            day = firstOfMonth;
            month++;
        }else {
            day++;
        }

        return day + CONNECTION + month + CONNECTION + year;


    }

    private static int getLastOfMonth(int month, int year) {
        int endOfMonth = 0;

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                endOfMonth= 31;
                break;

            case 2:
                if (year % 4 == 0){
                    if (year % 100 == 0){
                        if (year % 400 == 0){
                            endOfMonth = 29;
                            break;
                        }else {
                            endOfMonth= 28;
                            break;
                        }

                    }else {
                        endOfMonth = 29;
                        break;
                    }
                }else {
                    endOfMonth= 28;
                    break;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                endOfMonth= 30;
                break;
        }
        return endOfMonth;
    }
}
