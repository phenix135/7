package 校验;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
      //校验手机号码，邮箱，密码
        checkphone();
    }

    public static void checkphone(){
        while(true) {
            System.out.println("请您输入您的手机号码：");
            Scanner sc = new Scanner(System.in);
            String phone = sc.next();
            if (phone.matches("1[3-9]\\d{9}")) {
                System.out.println("输入成功");
            } else {
                System.out.println("请重新输入");
            }
        }
    }
}
