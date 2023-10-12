package Task4;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(2);
        Circle c3 = new Circle(1);
        Circle c4 = new Circle(6);

        Square s1 = new Square(4, 5);
        Square s2 = new Square(9, 6);
        Square s3 = new Square(5, 6);
        Square s4 = new Square(8, 2);
        Square s5 = new Square(3, 7);

        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShape(c1);
        shapeBuilder.addShape(c2);
        shapeBuilder.addShape(c3);
        shapeBuilder.addShape(c4);
        shapeBuilder.addShape(s1);
        shapeBuilder.addShape(s2);
        shapeBuilder.addShape(s3);
        shapeBuilder.addShape(s4);
        shapeBuilder.addShape(s5);

        System.out.println(shapeBuilder.getTotalArea());

    }
}
