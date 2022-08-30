package 常见算法;

import java.util.Arrays;

public class 选择排序 {
    public static void main(String[] args) {
        int []age={12,34,23,11,56,45,67};
        for (int i = 0; i < age.length-1; i++) {
            for (int j = i+1; j <age.length ; j++) {
                if (age[i] > age[j]) {
                    int temp=age[i];
                    age[i]=age[j];
                    age[j]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(age));
    }
}
