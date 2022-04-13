package day38.shapeTask;

public class Square extends Shape{
    public int side;
    public Square(int side) {
        super("Square");
        this.side=side;
    }

    @Override
    public double area() {
        double area=side*side;
        return area;
    }

    public double perimeter(){
        double perimeter=4*side;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", side=" + side + '\'' +
                ", Area=" + area() + '\'' +
                ", Perimeter=" + perimeter() +
                '}';
    }
}
