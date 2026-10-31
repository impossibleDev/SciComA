package u3.quadshapes;

public class Trapezoid extends Quadrilateral {
    private double base1, base2, height;

    public Trapezoid(double base1, double base2, double height, double skewOffset) {
        super();
        if (base1 <= 0) throw new IllegalArgumentException("base1 must be > 0");
        if (base2 <= 0) throw new IllegalArgumentException("base2 must be > 0");
        if (height <= 0) throw new IllegalArgumentException("height must be > 0");
        
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        
        double halfHeight = height / 2;
        double halfSkewOffset = skewOffset / 2;
        double halfBase1 = base1 / 2;
        double halfBase2 = base2 / 2;
        
        Point[] pts = new Point[4];
        pts[0] = new Point(-halfBase1 + halfSkewOffset, halfHeight);
        pts[1] = new Point(halfBase1 + halfSkewOffset, halfHeight);
        pts[2] = new Point(-halfBase2 - halfSkewOffset, -halfHeight);
        pts[3] = new Point(halfBase2 - halfSkewOffset, -halfHeight);
        
        setPoints(pts);
    }

    @Override
    public double getArea() {
        return (base1 + base2) * height / 2;
    }

    public double getBase1() { return base1; }
    public double getBase2() { return base2; }
    public double getHeight() { return height; }

    @Override
    public String toString() {
        return String.format("Trapezoid[base1=%.2f, base2=%.2f, height=%.2f, area=%.2f]", 
            base1, base2, height, getArea());
    }
}
