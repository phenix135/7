package Stream流;

import java.util.ArrayList;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("张无忌");
        list.add("张三封");
        list.add("李强");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        System.out.println(list);
        /**普通的方法
        List<String> zhanglist=new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张")){
                zhanglist.add(s);
            }
        }
        System.out.println(zhanglist);

        List<String> zhangthree =new ArrayList<>();
        for (String s : zhanglist) {
            if(s.length()==3){
                zhangthree.add(s);  //s为zhanglist中的元素,为字符串
            }
        }
        System.out.println(zhangthree);
         */
        //Stream流
        list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3).forEach(s-> System.out.println(s));
    }
}
