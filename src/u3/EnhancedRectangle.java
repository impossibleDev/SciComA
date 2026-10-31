package u3;

public class EnhancedRectangle {

    public static void main(String[] args) {
        Point[] testPoints = {
            new Point(2.0, 2.0),
            new Point(2.0, 8.0),
            new Point(6.0, 8.0),
            new Point(6.0, 2.0)
        };

        try {
            EnhancedRectangle rect = new EnhancedRectangle(testPoints);
            System.out.println("Length: " + rect.getLength());
            System.out.println("Width: " + rect.getWidth());
            System.out.println("Perimeter: " + rect.getPerimeter());
            System.out.println("Area: " + rect.getArea());
            System.out.println("Is Square? " + rect.isSquare());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    private Point[] points = new Point[4];
    private boolean longestLineAt0 = true;

    private boolean legalPos(Point p) {
        return p.getX() >= 0 && p.getY() >= 0 && p.getX() <= 20 && p.getY() <= 20;
    }

    public EnhancedRectangle(Point[] points) {
        set(points);
    }

    public void set(Point[] points) {
        //array
        if (points.length != 4) {
            throw new IllegalArgumentException("# of points of a rectangle must be 4");
        }

        //points
        for (int i = 0; i < 4; i++) {
            Point p = points[i];
            if (legalPos(p)) {
                this.points[i] = p;
            } else {
                throw new IllegalArgumentException("Rectangle points cannot be out of bounds");
            }
        }
        
        //too hard for rectangle shape validation

        if (points[1].distTo(points[2]) > points[0].distTo(points[1])) {
            longestLineAt0 = false;
        }
    }

    public double getLength() {
        return longestLineAt0 ? points[0].distTo(points[1]) : points[1].distTo(points[2]);
    }

    public double getWidth() {
        return longestLineAt0 ? points[1].distTo(points[2]) : points[0].distTo(points[1]);
    }

    public double getPerimeter() {
        return (points[1].distTo(points[2]) + points[0].distTo(points[1])) * 2;
    }

    public double getArea() {
        return points[1].distTo(points[2]) * points[0].distTo(points[1]);
    }

    public boolean isSquare() {
        return Math.abs(getLength() - getWidth()) < 0.0001;
    }

}
