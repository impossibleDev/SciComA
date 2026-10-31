package u3.shapes;

public class Sphere extends ThreeDimensionalShape {
    private double radius;
    public Sphere(double radius){
        if (radius<=0)
            throw new IllegalArgumentException("Sphere radius must be > 0");
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI*radius*radius*4.0;
    }
    @Override
    public double getVolume() {
        return Math.PI*radius*radius*radius*4.0/3;
    }

    @Override
    public String toString() {
        return "Sphere with radius " + radius;
    }
}
