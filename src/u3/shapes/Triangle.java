package u3.shapes;

public class Triangle extends TwoDimensionalShape{
    private double height;
    private double base;
    public Triangle(int height, int base){
        if (height<=0)
            throw new IllegalArgumentException("Triangle height must be > 0");
        if (base<=0)
            throw new IllegalArgumentException("Triangle base must be > 0");
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        return height*base/2;
    }

    @Override
    public String toString() {
        return "Triangle with base " + base + " and height " + height;
    }
}
