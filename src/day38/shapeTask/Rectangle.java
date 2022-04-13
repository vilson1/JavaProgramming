package day38.shapeTask;

public class Rectangle extends Shape{

    public int length, width;

    public Rectangle(int length, int width) {
        super("Rectangle");
        this.length=length;
        this.width=width;
    }

    @Override
    public double area() {
        double area=length*width;
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter=2*length+2*width;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name +
                ", length=" + length +'\'' +
                ", width=" + width +'\'' +
                ", name='" + name + '\'' +
                ", Area='" + area() + '\'' +
                ", Perimeter='" + perimeter() +
                '}';
    }
}
