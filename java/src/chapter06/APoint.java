package chapter06;

public class APoint implements Point{

    private double x;
    private double y;
    private double z;

    public APoint(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double sumAllPoint() {
        return this.x + this.y + this.z;
    }
}
