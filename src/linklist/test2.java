package linklist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class test2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("黑马");
        list.add("java");
        list.add("java");
        list.add("赵敏");
        list.add("赵敏");
        list.add("苏苏");

      /**  //1，迭代器删除元素
        Iterator<String> it= list.iterator();
        while(it.hasNext()){
            String ele=it.next();
            if(ele.equals("java")){
                it.remove();//删除当前元素，并且不会后移
            }
        }
        System.out.println(list);
       */

      //2,增强for,不能边遍历边删除
     /**   for (String s : list) {
            if(s.equals("java")){
               list.remove(s);
            }
        }
     */
     //3.lanbda表达式不能边遍历边删除



    //for循环.,倒着删除

        for (int i = list.size()-1; i >0; i--) {
            String s= list.get(i);
            if("java".equals(s)){
                list.remove(s);
            }
        }
        System.out.println(list);

       }
}
