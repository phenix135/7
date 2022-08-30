package set系列集合;

import org.jetbrains.annotations.NotNull;

public class apple4 implements Comparable<apple4> {
    private String name;
    private String color;
    private int weight;

    public apple4() {
    }

    public apple4(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "apple4{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    //类自定义比较规则

    @Override
    public int compareTo( apple4 o) {
        return this.weight-o.weight>=0?1:-1;
    }
}
