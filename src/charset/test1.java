package charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 自己学会编码和解码
 */
public class test1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //1,编码，将文字转化为字节
      String name="我爱你中国abc";
     // byte[]bytes=name.getBytes();当前默认为UTF-8
        byte[]bytes=name.getBytes("GBK");
        System.out.println(bytes.length);//占18个字节
        System.out.println(Arrays.toString(bytes));//输出数组的内容



        //2,解码：将字节转换为文字(用什么编码，就用什么解码）,默认为utf-8
        String rs= new String(bytes,"GBK");
        System.out.println(rs);
    }
}
