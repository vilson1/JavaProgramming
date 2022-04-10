package Day28;

public class StrongPassword2 {
    public static void main(String[] args) {
        String password="Vilson123@";

        int countUpperCase=0;
        int countLowerCase=0;
        int countDigits=0;
        int countSpecialChars=0;

        for (int i = 0; i < password.length(); i++) {

            char ch=password.charAt(i);

            if (Character.isUpperCase(ch)){
                countUpperCase++;
            }
            else if (Character.isLowerCase(ch)){
                countLowerCase++;
            }
            else if (Character.isDigit(ch)){
                countDigits++;
            }
            else
                countSpecialChars++;


        }
       boolean isStrongPass= password.length()>=8 && countDigits!=0
               && countLowerCase!=0 && countUpperCase!=0 && countSpecialChars!=0 && !password.contains(" ");

        System.out.println(isStrongPass);
    }
}
