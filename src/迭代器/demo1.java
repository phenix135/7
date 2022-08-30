package 迭代器;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("黑马");
        list.add("java");
        list.add("java");
        list.add("赵敏");
        list.add("赵敏");
        list.add("苏苏");

        //1，迭代器删除元素
        Iterator<String> it= list.iterator();
        while(it.hasNext()){
            String ele=it.next();
            if(ele.equals("java")){
                it.remove();//删除当前元素，并且不会后移
            }
        }
        System.out.println(list);
    }
        }
