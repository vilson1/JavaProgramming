package day45.shapesTask;

public class Cylinder extends Shape implements Volume{

    private double radius;
    private double height;
    private final static double pi=3.14;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        setRadius(radius);
        setHeight(height);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            throw new RuntimeException("Invalid radius "+radius);
        }
        this.radius = radius;
    }

    public double getHeight() {
        if (height<=0){
            throw new RuntimeException("Invalid heit "+height);
        }
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public void volume() {

    }
}
