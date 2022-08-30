package Map集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
//记录A,B,C,D的次数，并用MAP集合输出
public class demo1 {
    public static void main(String[] args) {
        //
        String []name={"A","B","C","D"};
        StringBuilder sb=new StringBuilder();
        Random sc=new Random();
        for (int i = 0; i < 80; i++) {
            sb.append(name[sc.nextInt(name.length)]);
        }
        System.out.println(sb);
        Map<Character,Integer> maps=new HashMap<>();
        for (int i = 0; i < 80; i++) {
            char ch=sb.charAt(i);
            if(maps.containsKey(ch)){
                maps.put(ch, maps.get(ch)+1);
            }else{
                maps.put(ch,1);
            }
        }
        System.out.println(maps);
    }
}
