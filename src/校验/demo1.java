package 校验;

public class demo1 {
    public static void main(String[] args) {
        System.out.println(checkQQ("1711504691"));
    }

    public static boolean checkQQ(String qq){
      //1.判断qq号码的长度
        if(qq==null||qq.length()<6||qq.length()>20){
            return false;
        }
        //2,判断qq中是否全部为数字,不是返回false
        for (int i = 0; i < qq.length(); i++) {
            //获取每位字符
            char ch =qq.charAt(i);
            //判断是否在0到9之间
            if(ch<'0'||ch>'9'){
                return false;
            }
        }
        return true;
    }
}
