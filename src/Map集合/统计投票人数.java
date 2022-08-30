package Map集合;

import java.util.*;
      //集合的嵌套
public class 统计投票人数 {
    public static void main(String[] args) {
        //1,要求程序记录每个成员的情况
        Map<String, List<String>> maps=new HashMap<>();//集合嵌套

        //2,输入三个学生的数据
        List<String> selects=new ArrayList<>();
        Collections.addAll(selects,"A","B");
        maps.put("李白",selects);

        List<String> selects1=new ArrayList<>();
        Collections.addAll(selects1,"A","B","C");
        maps.put("胡涛",selects1);

        List<String> selects2=new ArrayList<>();
        Collections.addAll(selects2,"A","B","C","D");
        maps.put("白京",selects2);

        System.out.println(maps);
        //统计A,B,C,D四个地方去的人数，找出最受欢迎的地方
         //定义一个集合装4个景点和人数
        Map<String,Integer> infos=new HashMap<>();

        //提取所有人选择的信息
        Collection<List<String>> values = maps.values();
        //集合values的元素为{"A","B"},{"A","B","C"},{"A","B","C","D"}
        for (List<String> value : values) { //遍历values的元素
            for (String s : value) {        //遍历value的元素
                if(infos.containsKey(s)){
                    infos.put(s,infos.get(s)+1);
                }else{
                    infos.put(s,1);
                }
            }
        }
        System.out.println(infos);
    }
}
