package 包装类;

public class test1 {
    public static void main(String[] args) {
        int a=11;
        Integer a1=a;    //自动装箱
        System.out.println(a);
        System.out.println(a1);

        Double b=11.0;
        double b1=b;  //自动拆箱
        System.out.println(b);
        System.out.println(b1);

        //null是空地址，要用引用类型的变量来接
       // int age=null;报错

        Integer age=null;
        System.out.println(age);

        System.out.println("-------------");
        //包装类把基本数据类型转换为字符串类
        Integer d1=12;
        String rs=Integer.toString(d1);
        System.out.println(rs+1);

        String rs1=d1.toString();
        System.out.println(rs1+1);
       //直接将整数转换为字符串类型
        System.out.println("-----------------------");
        String d2=d1+"";
        System.out.println(d2+1);

        System.out.println("----------------");
        String number="19";
        //*字符串转换成整数，小数
        int age1=Integer.parseInt(number);
        Double age2=Double.parseDouble(number);
        System.out.println(age1);
        System.out.println(age2);

    }
}
