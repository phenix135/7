package day1;
                      //静态代码块用于初始化静态资源
import java.util.ArrayList;

public class 斗地主生成54张牌 {
    /**
     * 定义一个集合用来装牌
     *
     */
   public static ArrayList<String> list =new ArrayList<>();

   static {
        String []name={"3","4","5","6","7","8","9","10","J","Q","K","A"};
        String []index={"♦","♥","♠","♣"};
        String code;
       for (int i = 0; i < index.length; i++) {
           for (int j = 0; j< name.length; j++) {
              code=index[i]+name[j];
              list.add(code);
           }
       }
       list.add("大🃏");
       list.add("小🃏");
   }

    public static void main(String[] args) {
        System.out.println(list);
    }

}
