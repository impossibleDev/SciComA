package u3.quadshapes;

public abstract class Quadrilateral {
    
    private Point[] points = new Point[4];
    
    protected Quadrilateral() {
        // Default constructor for subclasses
    }
    
    protected void setPoints(Point[] points) {
        if (points == null || points.length != 4) {
            throw new IllegalArgumentException("Quadrilateral must have exactly 4 points");
        }
        this.points = points.clone();
    }
    
    public abstract double getArea();

    public Point[] getPoints(){return points.clone();}
    
}
