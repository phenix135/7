package 时间类API;

import java.time.LocalDate;

public class demo9加减时间 {
    public static void main(String[] args) {
        LocalDate d1=LocalDate.now();
        System.out.println(d1.minusYears(1));//减一年
        System.out.println(d1.minusMonths(1));//减一月
        System.out.println(d1.minusDays(1));//减一天

        System.out.println(d1.plusYears(1));//加一年
        System.out.println(d1.plusMonths(1));//加一个月
    }
}
