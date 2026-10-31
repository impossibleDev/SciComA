package u3.shapes;

public class Square extends TwoDimensionalShape{
    private double length;
    public Square(double length){
        if (length<=0)
            throw new IllegalArgumentException("Square length must be > 0");
        this.length = length;
    }
    @Override
    public double getArea() {
        return length*length;
    }

    @Override
    public String toString() {
        return "Square with side length " + length;
    }
}
