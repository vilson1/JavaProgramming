package day38.shapeTask;

public class Circle extends Shape{
    public int radius;
    public static double PI=3.14;

    public Circle(int radius) {
        super("Circle");
        this.radius=radius;
    }

    @Override
    public double area() {
        double area=PI*radius*radius;
        return area;

    }

    @Override
    public double perimeter() {
        double perimeter=2*radius*PI;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + '\'' +
                ", name='" + name + '\'' +
                ", PI='" + PI + '\'' +
                ", Area ='" + area() + '\'' +
                ", Perimeter ='" + perimeter() +
                '}';
    }
}
