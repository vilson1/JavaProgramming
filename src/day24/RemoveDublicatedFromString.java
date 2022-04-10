package day24;

public class RemoveDublicatedFromString {
    public static void main(String[] args) {

        String str="aaaaaaaabbbbfgddddd";
        removeDublicated(str);
        System.out.println( removeDublicated(str));
    }
    public static String removeDublicated(String str){
        String unique="";
        for (int i = 0; i < str.length(); i++) {
            char each =str.charAt(i);
            if (!unique.contains(""+each)){
                unique+=each;
            }

        }
        return unique;
    }
}
