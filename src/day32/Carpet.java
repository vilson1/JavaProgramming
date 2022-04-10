package day32;

public class Carpet {
    public double width,length, unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", Total Price= $"+ calcCost()+
                '}';
    }

    public double calcCost(){
       double totalCost=width*length*unitPrice;
       if (isPersian){
           totalCost+=200;
       }
       return totalCost;

    }
}
