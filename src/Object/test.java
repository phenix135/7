package Object;

public class test {
    public static void main(String[] args) {
        Student s =new Student("周雄",19,"男");
        System.out.println(s.toString());

        System.out.println("----------");
        //输出对象变量，tostring（）可以不写
        System.out.println(s);
    }
}
