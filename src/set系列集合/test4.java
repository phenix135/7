package set系列集合;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class test4 {
    public static void main(String[] args) {
        Set<apple4> set=new TreeSet<>(new Comparator<apple4>() {
            @Override
            public int compare(apple4 o1, apple4 o2) {
                return o1.getWeight()- o2.getWeight();
            }
        });
        apple4 a1=new apple4("红富士","红色",300);
        apple4 a2=new apple4("黄富士","黄色",400);
        apple4 a3=new apple4("绿富士","绿色",350);
        apple4 a4=new apple4("青富士","青色",500);

        set.add(a1);
        set.add(a2);
        set.add(a3);
        set.add(a4);
        System.out.println(set);
    }
}
