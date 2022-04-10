package day31;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1=new Offer();
        offer1.setInfo("VA","Amazon","SDET",110000,true,true,true,true);

         Offer offer2=new Offer();
         offer2.setInfo("California","Sonny","QA",120000,true,false,false,false);

         Offer offer3=new Offer();
         offer3.setInfo("Florida","Apple","QE", 125000, true,true,true,true);

         Offer offer4=new Offer();
         offer4.setInfo("Tx","Capital One","SM",115000,false,false,true,true);

         Offer offer5=new Offer();
         offer5.setInfo("WA","BankOfAmarika","BA",130000,true,true,false,true);



         Offer[] offers={offer1,offer2,offer3,offer4,offer5};
        ArrayList<Offer> fullTime=new ArrayList<>(Arrays.asList(offers));

        fullTime.removeIf(p->!p.isFullTime);
        System.out.println(fullTime.size());

        System.out.println("----------------------------------------");
        ArrayList<Offer> localArea=new ArrayList<>(Arrays.asList(offers));

        localArea.removeIf(p->!p.location.equals("Florida"));
        System.out.println(localArea);
        System.out.println("---------------------------------------------");
    }
}
