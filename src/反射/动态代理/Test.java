package 反射.动态代理;

public class Test {
    public static void main(String[] args) {
    //学会使用动态代理解决问题
        UserService userService=ProxyUtil.getProxy(new UserServiceImpl());
        System.out.println(userService.login("admin", "123456"));
        System.out.println(userService.selectUsers());
        userService.deleteUsers();
    }
}
