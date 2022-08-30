package 时间类API;

import java.time.LocalDate;
import java.time.Period;

public class demo11period {
    public static void main(String[] args) {
        //拿到今天的时间
        LocalDate today=LocalDate.now();
        System.out.println(today);
      //出生时间
        LocalDate BirthDate=LocalDate.of(2003,7,7);
        System.out.println(BirthDate);

        //计算间隔
        Period period=Period.between(BirthDate,today);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}
