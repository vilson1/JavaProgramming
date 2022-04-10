package day37.phoneTask;

public class Samsung extends Phone{
    public Samsung( String model, String size, double prise, String color) {
        super("Samsung", model, size, prise, color);
    }

    public void freeze(){
        System.out.println(brand+" "+model+" in freezing");
    }
}
