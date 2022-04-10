package Methods;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */

        String hour=s.substring(0,2);
           String amOrpm=s.substring(s.length()-2);
           if (amOrpm.equals("AM")) {

               if (hour.equals("12"))
                   s = hour.replace("12", "00") + s.substring(2, s.length() - 2);
               else
                   s =s.substring(0, s.length() - 2);
           }
           else {
               switch (hour){
                   case "01":
                       s= hour.replace("01","13")+s.substring(2,s.length()-2);
                       break;
                   case "02":
                       s= hour.replace("02","14")+s.substring(2,s.length()-2);
                       break;
                   case "03":
                       s= hour.replace("03","15")+s.substring(2,s.length()-2);
                       break;
                   case "04":
                       s= hour.replace("04","16")+s.substring(2,s.length()-2);
                       break;
                   case "05":
                       s= hour.replace("05","17")+s.substring(2,s.length()-2);
                       break;
                   case "06":
                       s= hour.replace("06","18")+s.substring(2,s.length()-2);
                       break;
                   case "07":
                       s= hour.replace("07","19")+s.substring(2,s.length()-2);
                       break;
                   case "08":
                       s= hour.replace("08","20")+s.substring(2,s.length()-2);
                       break;
                   case "09":
                       s= hour.replace("09","21")+s.substring(2,s.length()-2);
                       break;
                   case "10":
                       s= hour.replace("10","22")+s.substring(2,s.length()-2);
                       break;
                   case "11":
                       s= hour.replace("11","23")+s.substring(2,s.length()-2);
                       break;
                   case "12":
                       s =s.substring(0, s.length() - 2);
                       break;

               }

               }
        System.out.println(s);


    }
}
