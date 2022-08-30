package 反射.动态代理;

public interface UserService {
    String login(String loginName,String passWord);
    void deleteUsers();
    String selectUsers();
}
