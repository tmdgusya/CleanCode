package chapter06;

public class PolarPoint implements Point {
    private double x;
    private double y;

    public PolarPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double sumAllPoint() {
        return this.x + this.y;
    }
}
