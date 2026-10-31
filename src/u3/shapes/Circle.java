package u3.shapes;

public class Circle extends TwoDimensionalShape{
    double radius;
    public Circle(double radius){
        if (radius<=0)
            throw new IllegalArgumentException("Circle radius must be > 0");
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius;
    }
}
