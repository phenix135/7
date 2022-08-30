package Object;

public class test2 {
    public static void main(String[] args) {
        Student s1=new Student("周雄",19,"男");
        Student s2=new Student("周雄",19,"男");

        System.out.println(s1.equals(s2));//默认的equals比较
    }
}
