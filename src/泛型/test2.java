package 泛型;

public class test2 {
    public static void main(String[] args) {
        String [] animals={"小猪","小马","小牛","小羊"};
        Integer [] ages={12,23,45,56,67};
        printArray(ages);
        printArray(animals);

    }
    public static <T> void printArray(T[] arr){
        if(arr!=null){
            StringBuilder sb=new StringBuilder("[");
            for(int i=0;i< arr.length;i++) {
                sb.append(arr[i]).append(i== arr.length-1?"":",");
            }
            sb.append("]");
            System.out.println(sb.toString());
        }else{
            System.out.println(arr);
        }
    }
}
