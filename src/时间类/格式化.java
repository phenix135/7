package 时间类;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Simpledateformat
 */
public class 格式化 {
    public static void main(String[] args) {
        //1.定义时间
        Date d =new Date();
        System.out.println(d);

        //2.格式化日期
        SimpleDateFormat sdf=new SimpleDateFormat("YYYY年MM月dd日 HH:mm:ss EEE a");

        String sr = sdf.format(d);
        System.out.println(sr);

        System.out.println("----------------");
        //3,格式化毫秒值
        long time1=System.currentTimeMillis();
        String sr1= sdf.format(time1);
        System.out.println(sr1);
    }
}
