package StringBuilder;

/**
 * 学会使用Stringbuilder
 */
public class test1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("c");
        System.out.println(sb.toString());

        StringBuilder sb1=new StringBuilder();
        //支持链式编程
        sb1.append("a").append("b").append("c").append("我爱你中国");
        System.out.println(sb1);

        StringBuilder sb2=new StringBuilder();
        sb2.append("123").append("456");

        String sr= sb2.toString();

        System.out.println(sr);
        System.out.println(sb2);
    }
}
