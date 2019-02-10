public class Rectangle extends GeometricShape {

    private int length;
    private int height;

    public Rectangle(String name, int x, int y, int length, int height) {
        super(name, x, y);
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
