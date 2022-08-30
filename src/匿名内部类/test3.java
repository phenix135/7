package 匿名内部类;

import javax.swing.*;

public class test3 {
    public static void main(String[] args) {
        //1,创建窗口
        JFrame win=new JFrame("登录界面");

        //2,创建一个按钮对象
        JButton btn= new JButton("登录");

        //3.将按钮添加到窗口上展示
        win.add(btn);
        //4,展示窗口

        win.setSize(400,300);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }
}
