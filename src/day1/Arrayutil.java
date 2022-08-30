package day1;
//直接调用工具类中的方法
public class Arrayutil{
    /**
     * 私有化构造器
     */
    private Arrayutil(){

    }

    public static String toString(int []age){
        if(age==null){
            return null;
        }
        String result="[";
        for (int i = 0; i < age.length; i++) {
            result+=i== age.length-1 ? age[i]:age[i]+",";
        }
        result +="]";
        return result;
    }
}
