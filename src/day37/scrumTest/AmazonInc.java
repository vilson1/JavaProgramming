package day37.scrumTest;

public class AmazonInc {
    public static void main(String[] args) {

        String company="Amazon inc";
        ProductOwner po=new ProductOwner("Vilson",30,'M',1234,100000,company);

        BusinessAnalyst ba=new BusinessAnalyst("Fation",29,'M',234,1200000,company);

        ScrumMaster sm=new ScrumMaster("Ali",36,'M',456,12345,company);



    }
}
