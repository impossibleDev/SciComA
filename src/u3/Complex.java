package u3;

public class Complex {

    private double real;
    private double imaginary;

    public Complex() {
        this(0, 0);
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    //MATH OPERATORS
    public void add(Complex num2) {
        this.real += num2.getRealNum();
        this.imaginary += num2.getImaginaryNum();
    }

    public void subtract(Complex num2) {
        this.real -= num2.getRealNum();
        this.imaginary -= num2.getImaginaryNum();
    }

    //GETTERS & SETTERS
    public double getRealNum() {
        return real;
    }

    public double getImaginaryNum() {
        return imaginary;
    }

    @Override
    public String toString() {
        return "(" + real + ", " + imaginary + ")";
    }

    public static void main(String[] args) {
        Complex num1 = new Complex(4,1);
        Complex num2 = new Complex(2,7);
        System.out.print(num1);
        System.out.print(num2);
        num1.subtract(num2);
        System.out.print(num1);
    }
}
