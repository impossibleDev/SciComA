package u3.quadshapes;

public class Parallelogram extends Trapezoid {

    private double base, height;

    public Parallelogram(double base, double height, double skewOffset){
        super(base, base, height, skewOffset);
        if (base<=0) throw new IllegalArgumentException("base must be > 0");
        if (height<=0) throw new IllegalArgumentException("height must be > 0");
        this.base = base;
        this.height = height;
        
        double halfBase = base/2;
        double halfHeight = height/2;
        double halfSkewOffset = skewOffset/2;
        Point[] pts = new Point[4];
        pts[0] = new Point(-halfBase+halfSkewOffset, halfHeight);
        pts[1] = new Point(halfBase+halfSkewOffset, halfHeight);
        pts[2] = new Point(-halfBase-halfSkewOffset, -halfHeight);
        pts[3] = new Point(halfBase-halfSkewOffset, -halfHeight);
        setPoints(pts);
    }
    
    @Override
    public double getArea() {
        return base*height;
    }

    public double getBase() { return base; }
    public double getHeight() { return height; }

    @Override
    public String toString() {
        return String.format("Parallelogram[base=%.2f, height=%.2f, area=%.2f]", 
            base, height, getArea());
    }
}
