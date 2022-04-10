package day20;

public class ReverseName {
    public static void main(String[] args) {
        String[] arr={"vilson shehu","Amar shehu","Ervisa shehu","Erblend shehu","Ariela shehu",
                "Ajan Shehu","Perla Shehu","Mexhit shehu","Nexhmije shehu"};

        for (String s : arr) {
            String reverse="";
            for (int i = s.length()-1; i >=0 ; i--) {
                reverse+=s.charAt(i);
            }
            System.out.println(reverse);

        }
    }
}
