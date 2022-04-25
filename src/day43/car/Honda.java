package day43.car;

public class Honda extends Car{

    public Honda(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Twist the key to ignition");
    }

    @Override
    public void stop(){
        System.out.println("Press the brake");
    }
}
