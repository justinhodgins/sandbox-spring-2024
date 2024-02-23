package projectTwo;

public class shape extends cone{

public static void main(String[] args){

    //creating objects
    sphere sphere = new sphere();
    cube cube = new cube();
    cylinder cylinder = new cylinder();
    cone cone = new cone();

    //setting radius and printing toString for the Sphere
    sphere.setRadius(2.0);
    System.out.println(sphere.toString());

    //setting width and printing toString for the Cube
    cube.setWidth(5);
    System.out.println(cube.toString());

    //setting height, radius, and printing toString for the Cylinder
    cylinder.setRadius(1.0);
    cylinder.setHeight(4.0);
    System.out.println(cylinder.toString());

    //setting height, radius, and printing toString for the Cone
    cone.setRadius(3.0);
    cone.setHeight(5.0);
    System.out.println(cone.toString());
}

}
