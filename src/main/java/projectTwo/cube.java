package projectTwo;

public class cube extends sphere{
    private double width;

    public cube() {
        this.width = 0.0;
    }

    public cube(double thiswidth) {
        width = thiswidth;
    }
public double getWidth() {
        return width;
}

public double setWidth(double thisWidth) {
        width = thisWidth;
        return width;
}

public double SurfaceArea() {
        return (6*Math.pow(width, 2));
    }
    public double Volume() {
        return Math.pow(width, 3);
    }

    @Override
    public String toString() {
        return "cube{" +
                "radius=" + radius +
                ", surfaceArea=" + SurfaceArea() + ", volume="+ Volume()+ '}';
    }
    }

