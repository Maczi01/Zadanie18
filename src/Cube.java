public class Cube extends Shape3D {

    private int length;
    private int height;
    private int width;

    public Cube(String name, int x, int y, int z, int length, int height, int width) {
        super(name, x, y, z);
        this.length = length;
        this.height = height;
        this.width = width;
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

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
