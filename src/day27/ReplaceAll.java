package day27;

public class ReplaceAll {

    //Replaces all the maching values with new values
    public static int[] replaceAll(int[] arr,int oldvalue, int newElement){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==oldvalue){
                arr[i]=newElement;
            }

        }
        return arr;
    }

    //Replaces all the maching values with new values
    public static double[] replaceAll(double[] arr,double oldvalue, double newElement){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==oldvalue){
                arr[i]=newElement;
            }

        }
        return arr;
    }

    //Replaces all the maching values with new values
    public static char[] replaceAll(char[] arr,char oldvalue, char newElement){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==oldvalue){
                arr[i]=newElement;
            }

        }
        return arr;
    }

    //Replaces all the maching values with new values
    public static String[] replaceAll(String[] arr,String oldvalue, String newElement){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(oldvalue)){
                arr[i]=newElement;
            }

        }
        return arr;
    }
}
