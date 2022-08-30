package 补充知识.装饰模式;

/**
 * 装饰模式
 */
public class DecoratorDemo {
    public static void main(String[] args) {
     InputStream is=new bufferedInputStream(new fileInputStream());
        System.out.println(is.read());
        System.out.println(is.read(new byte[3]));
    }
}
