package u3;

public class Rational {
    //basically fractions;

    protected int numer;
    ///numerator
    protected int denom; //denominator

    public Rational() {
        this(0, 1);
    }

    public Rational(int numer, int denom) {
        this.numer = numer;
        this.denom = denom;
        reduce();
    }

    public void setNumer(int numer){
        this.numer = numer;
    }

    public void setDenom(int denom){
        if (denom==0) throw new IllegalArgumentException("Denominator cannot be zero");
        this.denom = denom;
    }
    public int getNumerator() {
        return numer;
    }

    public int getDenominator() {
        return denom;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private void reduce() {
        if (numer == 0) {
            denom = 1;
            return;
        }
        int gcdNum = Math.abs(gcd(numer, denom));
        numer /= gcdNum;
        denom /= gcdNum;

        if (denom < 0) {
            numer = -numer;
            denom = -denom;
        }
    }

    //Add two Rational numbers: The result of the addition should be stored in reduced form.
    public void add(Rational r2) {
        numer = numer * r2.denom + r2.numer * denom;
        denom = denom * r2.denom;
        reduce();
    }

    // Subtract two Rational numbers: The result of the subtraction should be stored in reduced form.
    public void sub(Rational r2) {
        numer = numer * r2.denom - r2.numer * denom;
        denom = denom * r2.denom;
        reduce();
    }

    // Multiply two Rational numbers: The result of the multiplication should be stored in a reduced form.
    public void multiply(Rational r2) {
        numer *= r2.numer;
        denom *= r2.denom;
        reduce();
    }

    // Divide two Rational numbers: The result of the division should be stored in reduced form.
    public void divide(Rational r2) {
        numer *= r2.denom;
        denom *= r2.numer;
        reduce();
    }

    // Print Rational numbers in the form a/b, where a is the numerator and b is the denominator.
    public void print1() {
        System.out.printf(numer + "/" + denom);
    }

    // Print Rational numbers in floating-point format. (Consider providing formatting capabilities that enable the user of the class to specify the number of digits of precision to the right of the decimal point.)
    public void print2(int precision) {
        double value = (double) numer / denom;
        // Dynamically builds the format string like "%.2f", "%.4f", etc.
        System.out.printf("%." + precision + "f%n", value);
    }
}
