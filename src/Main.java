public class Main {

    public static void main(String[] args) {

        Line2D line1 = new Line2D("Line1", 4, 3, 10);
        Line2D line2 = new Line2D("Line2", 1, 0, 12);
        Circle circle1 = new Circle("Circle1", 5, 3, 10);
        Circle circle2 = new Circle("Circle2", 1, 6, 3);
        Rectangle rectangle1 = new Rectangle("Rectangle1", 2, 2, 10, 10);
        Rectangle rectangle2 = new Rectangle("Rectangle2", 7, 9, 5, 5);
        Ball ball1 = new Ball("Ball1", 5, 5, 4, 10);
        Ball ball2 = new Ball("Ball2", 2, 1, 4, 5);
        Cube cube1 = new Cube("Cube1", 2, 2, 10, 10, 10, 10);
        Cube cube2 = new Cube("Cube2", 0, 0, 0, 6, 6, 6);

        ShapeCalculator shapeCalculator = new ShapeCalculator();
        LineCalc lc = new LineCalc();
        System.out.println(shapeCalculator.ballVolume(ball1));
        System.out.println(lc.lineLength(line1));
        System.out.println(shapeCalculator.circleArea(circle1));
        System.out.println(shapeCalculator.rectangleArea(rectangle1));
        System.out.println(shapeCalculator.cubeVolume(cube1));


    }
}
