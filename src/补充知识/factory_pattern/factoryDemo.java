package 补充知识.factory_pattern;

public class factoryDemo {
    public static void main(String[] args) {
        Computer c1=factoryPattern.createComputer("huawei");
        c1.start();

        Computer c2=factoryPattern.createComputer("Mac");
        c2.start();
    }
}
