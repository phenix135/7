package 常见算法;
  //二分搜索(数组元素一定要按顺序来）
public class com {
    public static void main(String[] args) {
        int []age={1,2,3,4,5,6,7};
        System.out.println(getindex(age, 7));

    }
    public static int getindex(int[]age,int data){
        int left=0;
        int right= age.length-1;

        while(left<=right){
            int middleindex=(left+right)/2;

            if(data>age[middleindex]){
                left=middleindex+1;
            }else if(data<age[middleindex]){
                right=middleindex-1;
            }else{
                return middleindex;
            }

        }
        return -1;//查无此元素
    }
}
