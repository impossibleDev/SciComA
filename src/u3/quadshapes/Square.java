package u3.quadshapes;

public class Square extends Rectangle {
    private final double side;

    public Square(double side){
        super(side, side);
        if (side<=0) throw new IllegalArgumentException("Side must be > 0");
        this.side = side;
        
        double halfSide = side/2;
        Point[] pts = new Point[4];
        pts[0] = new Point(-halfSide, halfSide);
        pts[1] = new Point(halfSide, halfSide);
        pts[2] = new Point(-halfSide, -halfSide);
        pts[3] = new Point(halfSide, -halfSide);
        setPoints(pts);
    }

    @Override
    public double getArea() {
        return side*side;
    }

    public double getSide() { return side; }

    @Override
    public String toString() {
        return String.format("Square[side=%.2f, area=%.2f]", side, getArea());
    }
}
