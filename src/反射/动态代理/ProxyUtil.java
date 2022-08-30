package 反射.动态代理;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

public class ProxyUtil {
    //通过一个静态方法，为用户业务对象返回一个代理对象
    /**
     * public static Object newProxyInstance(ClassLoader loader,
     *                 Class<?>[] interfaces,
     *                 InvocationHandler h) {
     *             Objects.requireNonNull(h);
     *
     *             final Class<?> caller = System.getSecurityManager() == null
     *                     ? null
     *                     : Reflection.getCallerClass();
     */
    public static UserService getProxy(UserService obj){

        return (UserService) Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        long startTime =System.currentTimeMillis();
                        //真正触发对象的行为执行的
                           Object rs=method.invoke(obj,args);

                        long endTime =System.currentTimeMillis();
                        System.out.println(method.getName()+"方法耗时"+(endTime-startTime)/1000 +"s");
                        return rs;
                    }
                });
    }
}
