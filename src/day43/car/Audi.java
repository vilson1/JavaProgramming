package day43.car;

public class Audi extends Car{


    public Audi(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    @Override
    public void stop() {
        System.out.println("Press the brake");
    }

    @Override
    public void start() {

        System.out.println("Push the start button");
    }

    public void autoPark(){
        System.out.println(getBrand()+" "+getModel()+ " have the auto park feature.");
    }
}
