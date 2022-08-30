package 补充知识.装饰模式;

import java.util.Arrays;

/**
 * 原始类
 */
public class fileInputStream extends InputStream{

    @Override
    public int read() {
        System.out.println("低性能的方式读取一个字节a");
        return 97;
    }

    @Override
    public int read(byte[] buffer) {
        buffer[0]=1;
        buffer[1]=97;
        buffer[2]=98;
        System.out.println("低性能的方式读取一个字节数组"+ Arrays.toString(buffer));
        return 3;
    }
}
