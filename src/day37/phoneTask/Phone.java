package day37.phoneTask;

public class Phone {
    public String brand;
    public String model;
    public String size;
    public double prise;
    public String color;

    public static boolean hasBattery=true;

    public Phone(String brand, String model, String size, double prise, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.prise = prise;
        this.color = color;
    }

    public void call(long phoneNumber){
        System.out.println(brand+" "+model+" is calling "+phoneNumber);

    }

    public void text(long phoneNumber){
        System.out.println(brand+" "+model+" is texting "+phoneNumber);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", prise=$ " + prise +
                ", color='" + color + '\'' +
                ", hasBattery='" + hasBattery + '\'' +
                '}';
    }
}
