package project1;

public class Point {

    public Point(double xPoint, double yPoint){
        xPoint = x;
        yPoint = y;
    }

    // Setting up variables
private double x;
private double y;
private double point;

public double setX(double x){
   this.x =  x;
    return x;}

    public double getX(){
    return x;}

 public double setY(double y){
    this.y = y;
    return y;}

    public double getY(){
    return y;}

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

public double shiftX(double n){
       return  x += n;}
public double shiftY(double n){
        return y += n;}

    public double distance(Point p2) {
        double dx = this.x - p2.getX();
        double dy = this.y - p2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void rotate(double angle) {
        double newX = x * Math.cos(angle) - y * Math.sin(angle);
        double newY = x * Math.sin(angle) + y * Math.cos(angle);
        x = newX;
        y = newY;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", point=" + point +
                '}';
    }
}




