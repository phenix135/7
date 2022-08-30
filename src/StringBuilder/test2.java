package StringBuilder;

/**
 * 打印整形数组地内容
 */
public class test2 {
    public static void main(String[] args) {
      int []arr={1,2,3,4,5};
        System.out.println(to(arr));
    }

    //定义方法
    public static String to(int[] arr){
        if(arr!=null){
            //拼接数组
            StringBuilder sb =new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i== arr.length-1?"]":",");
            }
            return sb.toString();//toString在Object里重写了，输出sb的内容
        }else{
            return null;
        }
    }
}
