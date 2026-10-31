package u3.shapes;

import java.util.ArrayList;

public class ShapeTest {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(3));
        shapes.add(new Square(4));
        shapes.add(new Triangle(3, 5));
        shapes.add(new Sphere(2));
        shapes.add(new Cube(3));
        shapes.add(new Tetrahedron(4));

        for (Shape shape : shapes) {
            System.out.println(shape);

            if (shape instanceof TwoDimensionalShape) {
                TwoDimensionalShape twoDimensionalShape =
                        (TwoDimensionalShape) shape;
                System.out.printf("Area: %.2f%n", twoDimensionalShape.getArea());
            } else if (shape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape threeDimensionalShape =
                        (ThreeDimensionalShape) shape;
                System.out.printf("Surface area is %.2f%n",
                        threeDimensionalShape.getArea());
                System.out.printf("Volume is %.2f%n",
                        threeDimensionalShape.getVolume());
            } else {
                throw new IllegalStateException(
                        "Unsupported shape type: " + shape.getClass().getName());
            }

            System.out.println();
        }
    }
}
