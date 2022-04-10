package day37.phoneTask;

public class Nokia extends Phone{
    public Nokia( String model, String size, double prise, String color) {
        super("Nokia", model, size, prise, color);
    }

    public void selfDefense(){
        System.out.println("You can use "+brand+" "+model+" as a self defense tool");
    }

}
