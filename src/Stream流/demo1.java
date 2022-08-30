package Stream流;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//收集Stream流
public class demo1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("张无忌");
        list.add("张三封");
        list.add("李强");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
          //一个流只能使用一次，不能再收集一遍
        Stream<String> s1= list.stream().filter(s->s.startsWith("张"));
       List<String> zhanglist=s1.collect(Collectors.toList());
        System.out.println(zhanglist);



        //定义其他的流,可再收集
        Stream<String> s2= list.stream().filter(s->s.startsWith("张"));
        Set<String> zhangSet=s2.collect(Collectors.toSet());
        System.out.println(zhangSet);
    }
}
