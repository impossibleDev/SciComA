package u3.quadshapes;

public class Point {
    private final double x, y;

    public Point(){
        this(0,0);
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){return x;}
    public double getY(){return y;}

    //No set methods, cannot be changed
    // public void setX(double x){this.x = x;}
    // public void setY(double y){this.y = y;}
    
    @Override 
    public String toString(){
        return "("+x+", "+y+")";
    }
}
