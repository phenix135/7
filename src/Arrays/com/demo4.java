package Arrays.com;

import java.util.Arrays;

public class demo4 {
    public static void main(String[] args) {
        int []ages={1,3,4,5,2,7,6};
         Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        System.out.println("========================");

        int index=Arrays.binarySearch(ages,6);
        System.out.println(index);
    }
}
