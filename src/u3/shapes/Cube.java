package u3.shapes;

public class Cube extends ThreeDimensionalShape{
    private double length;
    public Cube(double length){
        if (length<=0)
            throw new IllegalArgumentException("Cube length must be > 0");
        this.length = length;
    }
    @Override
    public double getArea() {
        return length*length*6;
    }
    @Override
    public double getVolume() {
        return Math.pow(length,3);
    }

    @Override
    public String toString() {
        return "Cube with side length " + length;
    }
}
