package Lambda;

public class demo1 {
    public static void main(String[] args) {
        Animal s=new Animal() {
            @Override
            public void run() {
                System.out.println("老虎跑了起来");
            }
        };
        s.run();
    }
}
abstract class Animal{
    public abstract void run();
}