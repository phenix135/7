package 斗地主游戏;

public class card {
    private   String size;
    private String color;
    private int index;

    public card() {
    }

    public card(String size, String color,int index) {
        this.size = size;
        this.color = color;
        this.index=index;
    }

    public String getSize() {
        return size;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return size+color;
    }
}
