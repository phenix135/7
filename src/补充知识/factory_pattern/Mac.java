package 补充知识.factory_pattern;

public class Mac extends Computer{

    @Override
    public void start() {
        System.out.println(getName()+"以非常优雅的方式启动，并展现了一个苹果Logo");
    }
}
