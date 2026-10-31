package u3.shapes;

public class Tetrahedron extends ThreeDimensionalShape{
    private double edge;
    public Tetrahedron(double edge) {
        if (edge <= 0) {
            throw new IllegalArgumentException("Edge length must be greater than zero.");
        }
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    @Override
    public double getArea() {
        // Surface Area = sqrt(3) * a^2
        return Math.sqrt(3) * Math.pow(edge, 2);
    }

    @Override
    public double getVolume() {
        // Volume = (sqrt(2) / 12) * a^3
        return (Math.sqrt(2) / 12.0) * Math.pow(edge, 3);
    }

    @Override
    public String toString() {
        return "Tetrahedron with edge length " + edge;
    }
}
