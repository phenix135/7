package set系列集合;

import java.util.HashSet;
import java.util.Set;
//在Student3中定义hashcode,equals,以去掉数据相同的元素。先判断哈希值，再比较equals
public class set集合去重复3 {
    public static void main(String[] args) {
        Set<Student3> set=new HashSet<>();
        Student3 s1=new Student3("刘成",19,'男');
        Student3 s2=new Student3("李文",20,'男');
        Student3 s3=new Student3("刘成",19,'男');
        Student3 s4=new Student3("刘成",18,'男');
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.println(set);
        System.out.println(s1.toString());
    }
}
