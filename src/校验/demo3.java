package 校验;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        checkphone();

    }

    public static void checkphone(){
        System.out.println("请您输入您的手机号：");
        Scanner sc=new Scanner(System.in);
        String phonenumber=sc.next();
        if(phonenumber.matches("1[3-9]\\d{9}")){
            System.out.println("输入成功！");
        }else{
            System.out.println("输入失败，请重新输入");
        }
    }
}
