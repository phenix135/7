package 时间类API;

import java.time.LocalDateTime;
import java.time.LocalTime;
//LocalTime拿的是时分秒
public class demo8Localtime {
    public static void main(String[] args) {
        LocalTime nowtime =LocalTime.now();
        System.out.println(nowtime);  //输出此刻的时分秒

        //时
        int hour = nowtime.getHour();
        System.out.println("时："+hour);

        //分
        int minute =nowtime.getMinute();
        System.out.println("分："+minute);

        //秒
        int second= nowtime.getSecond();
        System.out.println("秒："+second);

        //纳秒
        int nano=nowtime.getNano();
        System.out.println(nano);

        System.out.println("---------------------------------");

        //用手填入时间(时分秒纳秒）
        LocalTime d1 =LocalTime.of(5,30,30,30);
        System.out.println(d1);

        //用手填入时间
        LocalDateTime d2=LocalDateTime.of(2003,7,7,5,30,4,5);
        System.out.println(d2);
    }
}
