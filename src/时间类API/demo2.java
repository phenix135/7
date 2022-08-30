package 时间类API;
     //Math类
public class demo2 {
    public static void main(String[] args) {
        double a= -1.6;
        System.out.println(Math.abs(a)); //求绝对值
        System.out.println(Math.ceil(a));//向上取整
        System.out.println(Math.floor(a));//向下取整

        System.out.println(Math.pow(2, 3));//2的3次方

        System.out.println(Math.round(a));//四舍五入

        double b=Math.random();   //生成0到1之间的随机数
        System.out.println(b);
    }
}
