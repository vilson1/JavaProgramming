package day38.shapeTask;

public class Rectangle extends Shape{

    private int length, width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length<=0){
            System.err.println("Invalid length");
            System.exit(1);
        }
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (length<=0){
            System.err.println("Invalid width");
            System.exit(1);
        }
        this.width = width;
    }

    public Rectangle(int length, int width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);

    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return 2*length+2*width;

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + getName() +
                ", length=" + length +'\'' +
                ", width=" + width +'\'' +
                ", Area='" + area() + '\'' +
                ", Perimeter='" + perimeter() +
                '}';
    }
}
