package 反射;

/**
 * 获取class类对象的三种方法
 */
public class test {
    public static void main(String[] args) throws Exception {
        //1,Class类中的静态方法：forName
        Class c=Class.forName("反射.Student");
        System.out.println(c);

        //2,类名.class
        Class c1=Student.class;
        System.out.println(c1);

        //3,对象.getClass,获取对象对应类的class对象
        Student s=new Student();
        Class c2=s.getClass();
        System.out.println(c2);

    }
}
