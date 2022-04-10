package day24;

public class ReturnMedhodsPractice3 {
    public static void main(String[] args) {
        String str="aabccdee";
        for (int i = 0; i < str.length(); i++) {
            int frequency=frequency(str,str.charAt(i));
            if (frequency==1){
                System.out.println(str.charAt(i));
            }

        }

    }
    public static int frequency(String str, char c){

        int count=0;
        for(char  each:str.toCharArray()){
            if (each==c){
                count++;
            }
        }

        return count;
    }
}
