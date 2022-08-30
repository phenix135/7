package 时间类API;

import java.util.Calendar;

//日历概述
public class demo6 {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        System.out.println(cal);

        int day =cal.get(Calendar.DAY_OF_YEAR);
        System.out.println(day);


    }
}
