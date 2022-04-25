package day43.car;

public final class Tesla extends Car{

    public Tesla(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    @Override
    public void stop() {

        System.out.println("Press the brake");
    }

    @Override
    public void start() {
        System.out.println("Say start");
    }


}
