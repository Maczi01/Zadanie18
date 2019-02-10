import org.w3c.dom.css.Rect;

public class Main {

    public static void main(String[] args) {

        ShapeCalculator shapeCalculator = new ShapeCalculator();
        LineCalc lc = new LineCalc();
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

        Shape[] shapes = {line1,line2,circle1,circle2,rectangle1,rectangle2,ball1,ball2,cube1,cube2};
        for (Shape shape : shapes) {
            if(shape instanceof Line2D){
                System.out.println("Odcinek o poczatku w punkcie " +
                        ((Line2D) shape).getX() + " " + ((Line2D) shape).getY() + " ma długość " + lc.lineLength((Line2D) shape) + " m");
            }
            else if(shape instanceof Circle){
                System.out.println("Okrag o promieniu " + ((Circle) shape).getRadius()+
                        " ma pole o powierzchni " + shapeCalculator.shapeArea((GeometricShape) shape) + "m2");
            }
            else if(shape instanceof Rectangle){

                System.out.println("Prostokat o dlugosciach bokow " + ((Rectangle) shape).getHeight()+ " i "+ ((Rectangle) shape).getLength()+
                    " ma pole o powierzchni " + shapeCalculator.shapeArea((GeometricShape) shape) + "m2");
            }
            else if (shape instanceof Ball){
                System.out.println("Kula o promieniu "+ ((Ball) shape).getRadius()+" ma objetosc "
                        +  shapeCalculator.volume((Shape3D) shape)+ " m3");
            }
            else if (shape instanceof Cube){
                System.out.println("Prostopadłościan o bokach"+ ((Cube) shape).getHeight()+", "
                        + ((Cube) shape).getLength()+
                        + ((Cube) shape).getWidth()+" ma objetosc " +  shapeCalculator.volume((Shape3D) shape)+ " m3");
            }
        }


//        System.out.println(shapeCalculator.volume(cube1));


    }
}
