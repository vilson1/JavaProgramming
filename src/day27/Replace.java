package day27;

public class Replace {

    //replace an element in a given index
    public static int[] replace(int[] arr, int index, int newElement){
       if (index>=0 && index<arr.length){
           arr[index]=newElement;
       }
       else
       {
           System.err.println("Invalid index: "+ index);
           System.exit(0);
       }
       return arr;

    }

    //replace an element in a given index
    public static double[] replace(double[] arr, int index, double newElement){
        if (index>=0 && index<arr.length){
            arr[index]=newElement;
        }
        else
        {
            System.err.println("Invalid index: "+ index);
            System.exit(0);
        }
        return arr;

    }

    //replace an element in a given index
    public static char[] replace(char[] arr, int index, char newElement){
        if (index>=0 && index<arr.length){
            arr[index]=newElement;
        }
        else
        {
            System.err.println("Invalid index: "+ index);
            System.exit(0);
        }
        return arr;

    }

    //replace an element in a given index
    public static String[] replace(String[] arr, int index, String newElement){
        if (index>=0 && index<arr.length){
            arr[index]=newElement;
        }
        else
        {
            System.err.println("Invalid index: "+ index);
            System.exit(0);
        }
        return arr;

    }
}
