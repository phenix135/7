package 时间类API;

import java.time.LocalDate;
    //LocalDate 拿的年月日
//LocalDate,LocalTime,LocalDateTime
public class demo7LocalDate {
       public static void main(String[] args) {
           LocalDate nowDate=LocalDate.now();
           System.out.println(nowDate);

           //年
           int year = nowDate.getYear();
           System.out.println(year);
           //月
           int month =nowDate.getMonthValue();
           System.out.println(month);   //7
           System.out.println(nowDate.getMonth());  //july
           System.out.println(nowDate.getMonth().getValue());//链式输出月份 7

           //日
           int days=nowDate.getDayOfMonth();
           System.out.println(days);

           //一年中的第几日
           int day =nowDate.getDayOfYear();
           System.out.println(day);

           System.out.println("----------------------------");
           LocalDate bt =LocalDate.of(2003,7,7);
           System.out.println(bt);  //输出日期
       }
}
