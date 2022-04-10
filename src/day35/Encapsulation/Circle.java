package day35.Encapsulation;

public class Circle {
    private double radius;
    public static double pi=3.14;

    public Circle(double radius){
        setRadius(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + ", "+
                "Area= "+ calcArea(radius) +", "+
                "Perimeter= "+calcPerimeter(radius)+
                '}';
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        if (radius<=0){
            System.err.println("Invalid radius");
            System.exit(0);
        }
        this.radius=radius;
    }

    public double calcArea(double radius){
        double area =radius*radius*pi;
        return area;
    }

    public double calcPerimeter(double radius){
        double perimeter=2*radius*pi;
       return perimeter;
    }

}
