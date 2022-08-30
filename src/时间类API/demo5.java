package 时间类API;

import java.text.SimpleDateFormat;
import java.util.Date;

//simple date format
public class demo5 {
       public static void main(String[] args) {
           Date d =new Date();
           SimpleDateFormat sdf =new SimpleDateFormat("YYYY年MM月dd日 HH:mm:ss EEE a");

           String rs= sdf.format(d);
           System.out.println(rs);
       }
}
