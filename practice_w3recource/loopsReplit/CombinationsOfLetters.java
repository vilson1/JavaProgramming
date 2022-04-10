package loopsReplit;

public class CombinationsOfLetters {
    public static void main(String[] args) {
        String combination="";
        for (char i = 'z'; i >='v' ; i--) {
            for (char j = 'z'; j >='v' ; j--) {
                combination=""+i+j;
                System.out.println(combination);

            }


        }
    }
}
