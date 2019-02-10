public class ShapeCalculator implements Calc2D, Calc3D{

//    @Override
//    public double circleArea(Circle circle) {
//        double a = Math.PI*Math.pow(circle.getRadius(),2);
//        return a;
//    }
//
//    @Override
//    public double rectangleArea(Rectangle rectangle) {
//        double a = rectangle.getHeight()*rectangle.getLength();
//        return a;
//    }

//    @Override
//    public double ballVolume(Ball ball) {
//        double v = 4.19*Math.pow(ball.getRadius(), 3);
//        return v;
//    }
//
//    @Override
//    public double cubeVolume(Cube cube) {
//        double v = cube.getHeight()*cube.getLength()*cube.getWidth();
//        return v;
//    }

    @Override
    public double shapeArea(GeometricShape shape) {
        if(shape instanceof Circle)
        return Math.PI * Math.pow(((Circle) shape).getRadius(), 2);;
        if(shape instanceof Rectangle)
        return ((Rectangle) shape).getLength()*((Rectangle) shape).getHeight();
        return 0;
    }

    @Override
    public double volume(Shape3D shape) {
        if(shape instanceof Ball)
            return 4.19 * Math.pow(((Ball) shape).getRadius(), 3);;
        if(shape instanceof Cube)
            return ((Cube) shape).getLength()*((Cube) shape).getHeight()*((Cube) shape).getWidth();
        return 0;
    }
}
