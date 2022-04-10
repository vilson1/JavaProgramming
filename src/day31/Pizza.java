package day31;

public class Pizza {
    public char size;
    public int numberOfcheeseToping, numberOfPepperoniTopping;

    public Pizza(char size, int numberOfcheeseToping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfcheeseToping = numberOfcheeseToping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double cost(){
        double startingPrice=(size=='S')? 10: (size=='M')? 12:14;
        double totalPrice=startingPrice+(numberOfcheeseToping+numberOfPepperoniTopping)*2;
        return totalPrice;

    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfcheeseToping=" + numberOfcheeseToping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                "Total Price = $"+cost()+
                '}';
    }
}
