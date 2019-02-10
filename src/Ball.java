public class Ball extends Shape3D{

    private int radius;

    public Ball(String name, int x, int y, int z, int radius) {
        super(name, x, y, z);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
