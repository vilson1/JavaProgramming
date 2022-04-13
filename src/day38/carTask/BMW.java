package day38.carTask;

public class BMW extends Car{

    public BMW( String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }
    public void brakeDown(){
        System.out.println(brand+" "+model+" is braking down");
    }
    public void race(){
        System.out.println(brand+" "+model+" is racing");
    }
    @Override
    public void start(){
        System.out.println("Call the mechanic to jump statr "+brand+" "+model);
    }
}
