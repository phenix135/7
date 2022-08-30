package 时间类API;

import java.util.Date;

//Date类
public class demo4 {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);  //输出当前时间

        long time =d.getTime();  //得到毫秒值
        System.out.println(time);

        //将毫秒值恢复为日期对象
       Date d1=new Date(time);
       System.out.println(d1);



    }
}
