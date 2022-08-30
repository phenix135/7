package Arrays.com;

import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
        int []age={15,16,17,18,19,20,12};
        //打印数组内容的API    toString()
        String s = Arrays.toString(age);
        System.out.println(s);

        System.out.println(Arrays.toString(age));

        //默认对数组进行升序排序,
        Arrays.sort(age);
        System.out.println(Arrays.toString(age));

        //二分搜索技术（前提是数组先排好序）
        int index=Arrays.binarySearch(age,20);//搜索55
        System.out.println(index);   //得到索引时该元素存在，负数则不存在
    }
}
