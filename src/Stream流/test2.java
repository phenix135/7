package Stream流;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张三封");
        list.add("李强");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        //filter()
        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));

        //count
        long time = list.stream().filter(s -> s.length() == 3).count();
        System.out.println(time);

        //limit()---取前几个
        list.stream().filter(s -> s.startsWith("张")).limit(2).forEach(s -> System.out.println(s));
        //可简化为：list.stream().filter(s->s.startsWith("张")).limit(2).forEach( System.out：：：println);

        //map加工方法
        //给所有元素前加一个 黑马的：
        list.stream().map(s -> "黑马的：" + s).forEach(s -> System.out.println(s));
        //前一个参数表示原材料，后一个参数表示加工后的结果
        System.out.println("-------------------------------");
        list.stream().map(s -> new Student(s)).forEach(System.out::println);  //构造器引用
        //可省略为list.stream().map(Student::new).forEach(System.out::println);

       //合并流
        Stream<String> s1=list.stream().filter(s->s.startsWith("张"));
        Stream<String> s2=Stream.of("java1","java2");
        Stream<String> s3=Stream.concat(s1,s2);
        s3.forEach(s-> System.out.println(s));


        //skip---跳出前几个
    }
}