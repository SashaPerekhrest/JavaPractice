public class Point {
    private final double x;
    private final double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return  String.format("[x = %.2f , y = %.2f]", x, y);
    }

    public Point add(Point point){
        return new Point(this.x + point.getX(), this.y + point.getY());
    }

    public Point sub(Point point){
        return new Point(this.x - point.getX(), this.y - point.getY());
    }

    public Point multiply(double k){
        return new Point(this.x * k, this.y * k);
    }
}