package 时间类API;
             //StringBuilder的使用
public class demo1 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder();
        sb.append("Runoob..");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.insert(8, "Java");
        System.out.println(sb);
        sb.delete(5, 8);
        System.out.println(sb);
    }



}
