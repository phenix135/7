package 补充知识.装饰模式;

/**
 * 装饰类，拓宽原始类的功能
 */
public class bufferedInputStream extends InputStream{
    private InputStream is;
    public bufferedInputStream (InputStream is){
        this.is=is;
    }
    @Override
    public int read() {
        System.out.println("提供8KB的缓冲区，提高读数据性能");
        return is.read();
    }

    @Override
    public int read(byte[] buffer) {
        System.out.println("提供8KB的缓冲区，提高读数据性能");
        return is.read(buffer);
    }
}
