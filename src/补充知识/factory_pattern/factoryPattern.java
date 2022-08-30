package 补充知识.factory_pattern;

public class factoryPattern {
    /**
     * 定义一个方法，创建对象返回
     */

    public static Computer createComputer(String info){
        switch (info){
            case"huawei":
                Computer c=new Huawei();
                c.setName("huawei pro 16");
                c.setPrice(5999);
                return c;

            case"Mac":
                Computer c2=new Mac();
                c2.setName("MacBook pro");
                c2.setPrice(11999);


            default:
                return null;
        }
    }
}
