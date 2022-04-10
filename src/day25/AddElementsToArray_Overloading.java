package day25;

public class AddElementsToArray_Overloading {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        String[] arr3={"Vilson","Shehu","Ervisa","Amar"};
        char[] arr2={'A','B','C','D'};

    }
    public static int[] addElement(int[] arr, int num){

        int[] arr2=new int[arr.length+1];

        int j=0;
        for (int i : arr) {
            arr2[j]=i;
            j++;
        }
        arr2[j]=num;

        return arr2 ;
    }
    public static double[] addElement(double[] arr, double num){

        double[] arr2=new double[arr.length+1];

        int j=0;
        for (double i : arr) {
            arr2[j]=i;
            j++;
        }
        arr2[j]=num;

        return arr2 ;
    }
    public static char[] addElement(char[] arr, char num){

        char[] arr2=new char[arr.length+1];

        int j=0;
        for (char i : arr) {
            arr2[j]=i;
            j++;
        }
        arr2[j]=num;

        return arr2 ;
    }
    public static String[] addElement(String[] arr, String num){

        String[] arr2=new String[arr.length+1];

        int j=0;
        for (String i : arr) {
            arr2[j]=i;
            j++;
        }
        arr2[j]=num;

        return arr2 ;
    }
}
