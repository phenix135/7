package 泛型;

public class test1 {
    public static void main(String[] args) {
        //模拟Arraylist为myArraylist
        MyArraylist<String> list=new MyArraylist<>();
        list.add("java");
        list.add("MYSQL");
        list.remove("java");
        System.out.println(list);
    }
}
