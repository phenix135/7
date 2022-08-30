package 补充知识.factory_pattern;

public class Huawei extends Computer {
    @Override
    public void start() {
        System.out.println(getName()+"电脑启动了");
    }
}
