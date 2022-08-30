package 时间类API;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class demo13chronounit {
    public static void main(String[] args) {
        LocalDateTime today=LocalDateTime.now();
        System.out.println(today);
        //出生时间
        LocalDateTime BirthDate=LocalDateTime.of(2003,7,7,5,30,11,11);
        System.out.println(BirthDate);

        //计算相差时间
        System.out.println("相差年数："+ ChronoUnit.YEARS.between(BirthDate,today));
        System.out.println("相差月数："+ChronoUnit.MONTHS.between(BirthDate,today));
        System.out.println("相差天数："+ChronoUnit.DAYS.between(BirthDate,today));
        System.out.println("相差小时数："+ChronoUnit.HOURS.between(BirthDate,today));
    }
}
