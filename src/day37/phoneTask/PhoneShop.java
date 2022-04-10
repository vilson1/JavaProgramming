package day37.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone1=new Iphone("iphone 12","6.7 inches",1200,"Black");

        Samsung samsung1=new Samsung("Note12","7 inches",1000,"Black");

        Nokia nokia1=new Nokia("3210","4 inches",200,"Blue");

        System.out.println(iphone1);
        System.out.println(samsung1);
        System.out.println(nokia1);

        iphone1.faceTime("vilson123");
        iphone1.faceTime(1234567890);

        System.out.println("----------------");

        samsung1.call(123456);
        samsung1.text(87654);

        System.out.println("-----------------------");

        nokia1.selfDefense();
    }
}
