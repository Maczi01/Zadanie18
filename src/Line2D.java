public class Line2D extends Shape2D {

    private int length;

    public Line2D(String name, int x, int y, int length) {
        super(name, x, y);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
