package projectTwo;

public class cylinder extends cube{

    private double radius;
    private double height;

    public cylinder(){
        this.radius = 0.0;
        this.height = 0.0;
    }

    public cylinder(double thisradius, double thisheight){
        radius = thisradius;
        height = thisheight;
    }


    public double getRadius() {
        return radius;
    }

    public double setRadius(double thisradius) {
        radius = thisradius;
        return radius;
    }
    public double getHeight() {
        return height;
    }
    public double setHeight(double thisheight) {
        height =thisheight;
        return height;
    }

    public double SurfaceArea() {
        return ((2 *Math.PI*radius*height)+(2*Math.PI*Math.pow(radius, 2)));
    }

    public double Volume() {
        return ((Math.PI*Math.pow(radius, 2))*height);
    }

    @Override
    public String toString() {
        return "cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                ", surfaceArea=" + SurfaceArea() + ", volume="+ Volume()+ '}';
    }
}
