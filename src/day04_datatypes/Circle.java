package day04_datatypes;

public class Circle {
    public static void main(String[] args) {

        double PI=3.15;
        double radius= 3.5;
        double diameter = radius*2;

        double area = PI*radius*radius;
        double perimeter = diameter*PI;


        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }



}
