package u3;

public class Point {

    private double x, y;

    public Point() {
        this(0,0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double distTo(Point p2) {
        return Math.hypot(x-p2.getX(), y-p2.getY());
    }
    
}
