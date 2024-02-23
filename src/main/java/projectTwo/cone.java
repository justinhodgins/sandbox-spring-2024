package projectTwo;

public class cone extends cylinder{

    protected double radius;
    protected double height;

    public cone(){
            radius = 0.0;
            height = 0.0;
    }

    public cone(double thisradius, double thisheight){
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
       height = thisheight;
        return height;
    }

    public double SurfaceArea() {
        double hSquared = Math.pow(height, 2);
        double rSquared = Math.pow(radius, 2);
        return ((Math.PI*radius)+(radius*Math.sqrt(hSquared+rSquared)));
    }

    public double Volume() {
        return ((4/3)*Math.PI*Math.pow(radius, 3));
    }

    @Override
    public String toString() {
        return "cone{" +
                "radius=" + radius +
                ", height=" + height +
                ", surfaceArea=" + SurfaceArea() + ", volume="+ Volume()+ '}';
    }
}
