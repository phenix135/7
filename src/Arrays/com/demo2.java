package Arrays.com;

import java.util.Arrays;
import java.util.Comparator;

public class demo2 {
    public static void main(String[] args){
        int []age={11,12,23,24};
        //1.Arrays的sort方法对有值的数组默认为为升序排序
        Arrays.sort(age);
        System.out.println(Arrays.toString(age));

        System.out.println("-----------------------------------");

        //2,(自定义排序,只能支持引用类型地排序）------降序
        Integer age1[]={12,34,90,35,11,12,32};
        Arrays.sort(age1,new Comparator<Integer>(){
        @Override
            public int compare(Integer a1,Integer a2){

            //return a1-a2;   升序
            return a2-a1;
        }
        });
        System.out.println(Arrays.toString(age1));
    }
}
