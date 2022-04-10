package day20;

public class PrintInitials {
    public static void main(String[] args) {
       /*1. create an array named classmates, and store 10 of your classmates'
        full names
        print the initials of each classmates in separate lines*/

        String[] arr={"vilson shehu","Amar shehu","Ervisa shehu","Erblend shehu","Ariela shehu",
                "Ajan Shehu","Perla Shehu","Mexhit shehu","Nexhmije shehu"};

        for (String s : arr) {
            System.out.println(""+s.charAt(0)+"."+s.charAt(s.indexOf(" ")+1));

        }
    }
}
