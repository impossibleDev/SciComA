package u3;

public class Rectangle {

    private double length, width;

    //default constructor, creates square by default
    public Rectangle() {
        length = 1.0;
        width = 1.0;
    }

    //parameterized constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getPerimeter(){
        return 2*(length+width);
    }

    public double getArea(){
        return length*width;
    }

    public void setLength(double length) {
        if (length > 0.0 || length < 20.0)
            this.length = length; 
        else
            throw new IllegalArgumentException("Length must be"
                    + "a floating-point number larger that 0 and less than 20");
    }

    public void setWidth(double width) {
        if (width > 0.0 || width < 20.0)
            this.width = width; 
        else
            throw new IllegalArgumentException("Width must be"
                    + "a floating-point number larger that 0 and less than 20");
    }
    

    @Override 
    public String toString(){
        return "Rectangle: length ="+length+" width="+width;
    }
}
