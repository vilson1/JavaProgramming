package day38.shapeTask;

public class Circle extends Shape{
    private int radius;
    public static double PI=3.14;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius<=0){
            System.err.println("Invalid radius");
            System.exit(1);
        }
        this.radius = radius;
    }

    public Circle(int radius) {
        super("Circle");
        setRadius(radius);
    }

    @Override
    public double area() {
        return PI*radius*radius;


    }

    @Override
    public double perimeter() {
        return 2*radius*PI;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + '\'' +
                ", name='" + getName() + '\'' +
                ", PI='" + PI + '\'' +
                ", Area ='" + area() + '\'' +
                ", Perimeter ='" + perimeter() +
                '}';
    }
}
