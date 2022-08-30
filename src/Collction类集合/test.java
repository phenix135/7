package Collction类集合;

import java.util.ArrayList;
import java.util.Collection;

public class test {
    public static void main(String[] args) {
        Collection<Movies> movies = new ArrayList<>();
        movies.add(new Movies("《你好，李焕英》", 9.6, "贾玲"));
        movies.add(new Movies("《海上钢琴师》", 9.2, "罗宾斯"));
        movies.add(new Movies("《摔跤吧，爸爸》", 9.4, "阿汉"));

        for (Movies s : movies) {
            System.out.println("片名：" + s.getName());
            System.out.println("评分：" + s.getScore());
            System.out.println("演员：" + s.getActor());
        }
    }
}
