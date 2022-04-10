package day30;

public class Car {
    public String brand;
    public String model;
    public int year;
    public String color;
    public int price;

    public void carInfo(String Brand, String Model, int Year, String Color, int Price){

        brand=Brand;
        model=Model;
        year=Year;
        color=Color;
        price=Price;

    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=$" + price +
                '}';

    }
    public void start(){
        System.out.println(brand+" is starting");
    }
    public void stop(){
        System.out.println(brand+" is stoping");
    }
    public void drive(){
        System.out.println(brand+" is driving");
    }
}
