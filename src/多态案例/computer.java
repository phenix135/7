package 多态案例;

public class computer {
    private String name;

    public void start(){
        System.out.println(name+"开机了");
    }

    /**
     *
     * 提供安装USB对象的入口
     */
     public void installUSB(USB usb){
       //通用功能
         usb.connect();

         //独有功能：先判断，再强转
         if(usb instanceof keyborad){
             keyborad k = (keyborad)usb;
             k.keydown();
         }else if(usb instanceof Mouse){
             Mouse m =(Mouse) usb;
             m.abclick();
         }

         usb.unconnect();
     }

    public computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
