package linklist;

import java.util.LinkedList;

public class test1 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();//具有栈和队列的功能
       //入栈
        list.addFirst("第一颗子弹");   //或者addfirst改为push
        list.addFirst("第二课颗子弹");
        list.addFirst("第三颗子弹");
        list.addFirst("第四颗子弹");
        System.out.println(list);
        //出栈
        System.out.println(list.removeFirst());  //将removefirst改为pop
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());

        //入队列
        System.out.println("-----------------------------------");
        list.addLast("第一颗子弹");
        list.addLast("第二颗子弹");
        list.addLast("第三颗子弹");
        list.addLast("第四颗子弹");
        //出队列
        System.out.println(list);


    }
}
