package 反射.动态代理;

public class UserServiceImpl implements UserService{
    @Override
    public String login(String loginName, String passWord) {

        String rs="登录名和密码错误";
        if("admin".equals(loginName)&&"123456".equals(passWord)){
            rs="登录成功";
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs;
    }

    @Override
    public void deleteUsers() {

        try {
            System.out.println("您正在删除用户数据");
            Thread.sleep(2500);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public String selectUsers() {

        String rs="正在查询用户数据";

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs;
    }
}
