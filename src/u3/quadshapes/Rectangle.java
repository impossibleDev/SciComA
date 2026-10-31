package u3.quadshapes;

public class Rectangle extends Parallelogram {
    private final double length, width;

    public Rectangle(double length, double width){
        super(length, width, 0);
        if (length<=0) throw new IllegalArgumentException("Length must be > 0");
        if (width<=0) throw new IllegalArgumentException("Width must be > 0");
        this.length = length;
        this.width = width;
        
        double halfLength = length/2;
        double halfWidth = width/2;
        Point[] pts = new Point[4];
        pts[0] = new Point(-halfWidth, halfLength);
        pts[1] = new Point(halfWidth, halfLength);
        pts[2] = new Point(-halfWidth, -halfLength);
        pts[3] = new Point(halfWidth, -halfLength);
        setPoints(pts);
    }

    @Override
    public double getArea() {
        return length*width;
    }

    public double getLength() { return length; }
    public double getWidth() { return width; }

    @Override
    public String toString() {
        return String.format("Rectangle[length=%.2f, width=%.2f, area=%.2f]", 
            length, width, getArea());
    }
}
