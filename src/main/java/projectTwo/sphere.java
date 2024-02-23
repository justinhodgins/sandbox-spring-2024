package projectTwo;


    public class sphere {

    protected double radius;

    public sphere() {
        radius = 0.0;

    }

    public sphere(double thisradius, double thissurfaceArea, double thisvolume) {
        radius = thisradius;

    }
    public double getRadius() {
        return radius;
    }

    public double setRadius(double thisRadius) {
        radius =thisRadius;
        return radius;
    }

    public double SurfaceArea() {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    public double Volume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "sphere{" +
                "radius=" + radius +
                ", surfaceArea=" + SurfaceArea() + ", volume="+ Volume()+ '}';
    }

}
