package 匿名内部类;

public class test2 {
    public static void main(String[] args) {
        swimming s =new swimming(){  //内部类
            @Override
            public void run() {
                System.out.println("学生在游泳");
            }
        };
        go(s);

    }
    /**
     * 老师，运动员，学生一起游泳
     */

    public static void go(swimming s){
        System.out.println("开始-----");
        s.run();
        System.out.println("结束-----");
    }

}

interface swimming{
    void run();
}