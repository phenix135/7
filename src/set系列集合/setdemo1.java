package set系列集合;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setdemo1 {
    public static void main(String[] args) {
        //看看Set类集合的特点，Hashset,linkedHashset,Treeset
        Set<String> sets=new HashSet<>();  //多态
        sets.add("java");
        sets.add("MYSQL");
        sets.add("java");
        sets.add("HTML");
        sets.add("SpringBoot");
        sets.add("dage" );
        System.out.println(sets);  //HashSet,元素无序，不重复，无索引

        System.out.println("-------------------------");

        Set<String> set1=new LinkedHashSet<>();  //多态
        set1.add("java");
        set1.add("MYSQL");
        set1.add("java");
        set1.add("HTML");
        set1.add("SpringBoot");
        set1.add("dage" );
        set1.add("dage" );
        System.out.println(set1);//LinkedHashSet,有序，不重复，无索引

        System.out.println("------------------------");

        Set<Integer> set2=new TreeSet<>();
        set2.add(12);
        set2.add(11);
        set2.add(11);
        set2.add(13);
        set2.add(17);
        set2.add(14);
        System.out.println(set2);//TreeSet可以排序，不重复，无索引
    }
}
