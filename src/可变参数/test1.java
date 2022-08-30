package 可变参数;

import java.sql.Array;
import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        sum();
        sum(12,23);
        sum(new int[]{1,2,3,4,5,6,7,8,9});

    }//1,一个形参列表中可变参数只能有一个
    //2，可变参数必须放在形参列表的最后面
    public static void sum(int...nums){   //可变参数，nums实际上可以看成一个数组
        System.out.println("长度为"+nums.length);
        System.out.println(Arrays.toString(nums));
    }
}
