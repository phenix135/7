package 时间类API;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class demo10instance {
    public static void main(String[] args) {
        //时间戳
        Instant instant=Instant.now();
        System.out.println(instant);   //返回世界时间

        //返回系统默认时间
        Instant instant1 =Instant.now();
        ZonedDateTime instant2=instant1.atZone(ZoneId.systemDefault());//系统默认时间
        System.out.println(instant2);


        //如何返回Date对象
        Date date=Date.from(instant);
        System.out.println(date);

    }
}
