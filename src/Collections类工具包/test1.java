package Collections类工具包;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
      List<String> names=new ArrayList<>();
        //1,批量添加元素
        Collections.addAll(names, "张超", "李文", "钟辉");
        System.out.println(names);

        //2,打乱集合元素的顺序
        Collections.shuffle(names);
        System.out.println(names);

        //3.将集合元素进行排序
        Collections.sort(names);
        System.out.println(names);

        //4自制比较器，参见Set系列集合中的test4


    }
}
