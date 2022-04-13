package day38.shapeTask;

public class Square extends Shape{
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side<=0){
            System.err.println("Invalid side");
            System.exit(1);
        }
        this.side = side;
    }

    public Square(int side) {
        super("Square");
        setSide(side);
    }

    @Override
    public double area() {
        return side*side;
    }

    public double perimeter(){
        return 4*side;

    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + getName() + '\'' +
                ", side=" + side + '\'' +
                ", Area=" + area() + '\'' +
                ", Perimeter=" + perimeter() +
                '}';
    }
}
