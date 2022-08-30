package Object;

import java.util.Objects;

public class test3 {
    public static void main(String[] args) {
        String s1="itheima";
        String s2="itheima";
        System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1, s2));
        //两种方法的效果一样，第一种判断主调为null的情况会出错，第二种则更规范
    }
}
