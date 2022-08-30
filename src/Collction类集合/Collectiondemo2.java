package Collction类集合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Collectiondemo2 {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
      //1，添加元素，添加成功返回一个true

        System.out.println(list.add("java"));
        list.add("11");
        list.add("13");
        System.out.println(list);

        //2,清空集合的元素
        //list.clear();
        //System.out.println(list);

        //3,判断集合是否为空，是空则返回true,反之为false
        System.out.println(list.isEmpty());

        //4,获取集合的大小
        System.out.println(list.size());

        //5,判断集合中是否包含某个元素
        System.out.println(list.contains("java"));

        //6，删除某个元素，如果有相同的元素，删除默认的第一个
       // System.out.println(list.remove("java"));

        //7.将集合转变为数组
        Object []arr= list.toArray();
        System.out.println("数组："+ Arrays.toString(arr));
    }
}
