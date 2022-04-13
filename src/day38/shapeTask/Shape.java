package day38.shapeTask;

public class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null){
            System.err.println("Name can not be null");
            System.exit(1);
        }
        if (name.isEmpty()||name.isBlank()){
            System.err.println("Invalid Name");
            System.exit(1);
        }
        this.name = name;
    }

    public Shape(String name) {

        setName(name);
    }

    public double area(){
        return 0;
    }
    public double   perimeter(){
        return 0;
    }

    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "Area ='" + area() + '\'' +
                "Perimeter='" + perimeter() + '\'' +
                '}';
    }
}
