package Collction类集合;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;


public class Collectiondemo1 {
    public static void main(String[] args) {
        //有序，可重复，有索引
        Collection list=new ArrayList();//多态
        list.add("java");
        list.add("java");
        list.add("mybaits");
        list.add(23);
        list.add("12");
        System.out.println(list);

        //无序，不能重复，无索引
        Collection list1=new HashSet();//多态
        list1.add("java");
        list1.add("java");
        list1.add("mybaits");
        list1.add(23);
        list1.add("12");
        System.out.println(list1);


    }
}
