package 时间类API;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class demo12Duration {
    public static void main(String[] args) {
        //拿到今天的时间
        LocalDateTime today=LocalDateTime.now();
        System.out.println(today);
        //出生时间
        LocalDateTime BirthDate=LocalDateTime.of(2003,7,7,5,30,11,11);
        System.out.println(BirthDate);

        Duration s =Duration.between(BirthDate,today);
        System.out.println(s.toDays());//天数
        System.out.println(s.toHours());//小时
    }
}
