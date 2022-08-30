package Map集合;

import java.util.HashMap;
import java.util.Map;

public class test1 {
    public static void main(String[] args) {
        //1,创建一个Hashmap集合,
        Map<String,Integer> maps=new HashMap<>();//一行经典代码
        maps.put("鸿星尔克",22);
        maps.put("乔丹",12);
        maps.put("java",1);
        maps.put("耐克",12);
        maps.put("java",100);
        System.out.println(maps);
    }
}
