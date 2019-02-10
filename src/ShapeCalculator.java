public class ShapeCalculator implements Calc2D, Calc3D{

    @Override
    public double circleArea(Circle circle) {
        double a = Math.PI*Math.pow(circle.getRadius(),2);
        return a;
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        double a = rectangle.getHeight()*rectangle.getLength();
        return a;
    }

    @Override
    public double ballVolume(Ball ball) {
        double v = 4.19*Math.pow(ball.getRadius(), 3);
        return v;
    }

    @Override
    public double cubeVolume(Cube cube) {
        double v = cube.getHeight()*cube.getLength()*cube.getWidth();
        return v;
    }
}
