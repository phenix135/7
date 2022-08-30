package 多态案例;

public class Mouse implements USB {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mouse(String name) {
        this.name = name;                  //有参构造器
    }

    @Override
    public void connect() {
        System.out.println(name + "成功插入电脑");

    }

    @Override
    public void unconnect() {
        System.out.println(name + "成功从电脑中拔出");
    }

    /**
     * 独有功能
     */
    public void abclick() {
        System.out.println("双击小心心");
    }
}