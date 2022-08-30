package 时间类;

import java.util.Date;

//  计算此刻1小时121秒后的日期时间
public class Date类 {
    public static void main(String[] args) {
        //1.得出此刻的日期对象
        Date d1=new Date();
        System.out.println(d1);

        //2.把时间走后1小时121秒
        long time2=System.currentTimeMillis();
        time2 +=(60*60+121)*1000;
       //3.
        //Date d2=new Date(time2);
        //System.out.println(d2);

        Date d3 =new Date();
        d3.setTime(time2);
        System.out.println(d3);
    }
}
