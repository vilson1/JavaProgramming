package utilities;

import java.util.Arrays;

public class ArraysUtility {
    //prints each element of int array,

    public static void eachElement(int[] arr){
        for (int i : arr) {
            System.out.println(i);
        }
    }

    //print elements of double array.
    public static void eachElement(double[] arr){
        for (double i : arr) {
            System.out.println(i);
        }
    }


    //print each element of char array
    public static void eachElement(char[] arr){
        for (char i : arr) {
            System.out.println(i);
        }
    }


    //print each element of String array.
    public static void eachElement(String[] arr){
        for (String i : arr) {
            System.out.println(i);
        }
    }


    //return max number from intiger array.

    public static int maxElement(int[] arr){
        int max;
        Arrays.sort(arr);
        max=arr[arr.length-1];
        return max;

    }

    //Return the max element from the array.
    public static double maxElement(double[] arr){
        double max;
        Arrays.sort(arr);
        max=arr[arr.length-1];
        return max;

    }

    //return the minimum number from int array.

    public static int minNumber(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    //return the minimum number from double array.

    public static double minNumber(double[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    //checks if the given intiger is contained in a given array.

    public static boolean contains(int[] arr, int num){
        boolean result=false;
        for (int i : arr) {
            if (i==num){
                result=true;
            }

        }
        return result;
    }

    //checks if the given double is contained in a given array.

    public static boolean contains(double[] arr, double num){
        boolean result=false;
        for (double i : arr) {
            if (i==num){
                result=true;
            }

        }
        return result;
    }

    //checks if the given char is contained in a given array.

    public static boolean contains(char[] arr, char ch){
        boolean result=false;
        for (char i : arr) {
            if (i==ch){
                result=true;
            }

        }
        return result;
    }

    //checks if the given String is contained in a given array.

    public static boolean contains(String[] arr, String str){
        boolean result=false;
        for (String i : arr) {
            if (i.equals(str)){
                result=true;
            }

        }
        return result;
    }


    //Add element int an intiger Array
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

    //Add element int an double Array
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

    //Add element int a char Array
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

    //Add element int a String Array
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

    //Returns the frequency of an intiger element from an Arrray.
    public static int frequencyOfElement(int[] arr,int element){
        int frequency=0;
        for (int i : arr) {
            if (element==i)
            {
                frequency++;
            }

        }
        return frequency;

    }

    //Returns the frequency of an double element from an Arrray.
    public static int frequencyOfElement(double[] arr,double element){
        int frequency=0;
        for (double i : arr) {
            if (element==i)
            {
                frequency++;
            }

        }
        return frequency;

    }

    //Returns the frequency of a char element from an Arrray.
    public static int frequencyOfElement(char[] arr,char element){
        int frequency=0;
        for (char i : arr) {
            if (element==i)
            {
                frequency++;
            }

        }
        return frequency;

    }

    //Returns the frequency of String element from an Arrray.
    public static int frequencyOfElement(String[] arr,String element){
        int frequency=0;
        for (String i : arr) {
            if (element.equals(i))
            {
                frequency++;
            }

        }
        return frequency;

    }

    //Returns unique elements of an Array in a new Array
    public static int[] uniqueElement(int[] arr){
        int[] result={};
        for (int i : arr) {
            if (ArraysUtility.frequencyOfElement(arr,i)==1){
                result=ArraysUtility.addElement(result,i);
            }

        }
        return result;
    }

    //Returns unique elements of an Array in a new Array
    public static double[] uniqueElement(double[] arr){
        double[] result={};
        for (double i : arr) {
            if (ArraysUtility.frequencyOfElement(arr,i)==1){
                result=ArraysUtility.addElement(arr,i);
            }

        }
        return result;
    }

    //Returns unique elements of an Array in a new Array
    public static char[] uniqueElement(char[] arr){
        char[] result={};
        for (char i : arr) {
            if (ArraysUtility.frequencyOfElement(arr,i)==1){
                result=ArraysUtility.addElement(result,i);
            }

        }
        return result;
    }

    //Returns unique elements of an Array in a new Array
    public static String[] uniqueElement(String[] arr){
        String[] result={};
        for (String i : arr) {
            if (ArraysUtility.frequencyOfElement(arr,i)==1){
                result=ArraysUtility.addElement(result,i);
            }

        }
        return result;
    }


    //Return a new Array after removing indexed element
    public static int[] removeElement(int[] arr, int index){
        if (index<0 || index>arr.length-1)
        {
            System.err.println("Invalid Index"+ index);
            System.exit(0);
        }
        int[] result=new int[arr.length-1];


        int j=0;
        for (int i=0 ; i<arr.length; i++) {
            if (i==index)
            {
                continue;
            }
            result[j]=arr[i];
            j++;



        }
        return result;
    }

    //Return a new Array after removing indexed element
    public static double[] removeElement(double[] arr, double index){
        if (index<0 || index>arr.length-1)
        {
            System.err.println("Invalid Index"+ index);
            System.exit(0);
        }
        double[] result=new double[arr.length-1];



        for (int i=0 ,j=0; i<arr.length; i++,j++) {
            if (i==index)
            {
                continue;
            }
            result[j]=arr[i];




        }
        return result;
    }

    //Return a new Array after removing indexed element
    public static char[] removeElement(char[] arr, char index){
        if (index<0 || index>arr.length-1)
        {
            System.err.println("Invalid Index"+ index);
            System.exit(0);
        }
        char[] result=new char[arr.length-1];


        int j=0;
        for (int i=0 ; i<arr.length; i++) {
            if (i==index)
            {
                continue;
            }
            result[j]=arr[i];
            j++;



        }
        return result;
    }

    //Return a new Array after removing indexed element
    public static String[] removeElement(String[] arr, int index){
        if (index<0 || index>arr.length-1)
        {
            System.err.println("Invalid Index"+ index);
            System.exit(0);
        }
        String[] result=new String[arr.length-1];


        int j=0;
        for (int i=0 ; i<arr.length; i++) {
            if (i==index)
            {
                continue;
            }
            result[j]=arr[i];
            j++;



        }
        return result;
    }


    //Merge two arrays and return a new array.
    public static int[] merge(int[] arr,int[] arr2){
        int[] result= {};

        for (int i : arr) {
            result= ArraysUtility.addElement(result,i);
        }
        for (int i : arr2) {
            result= ArraysUtility.addElement(result,i);

        }
        return result;
    }

    //Merge two arrays and return a new array.
    public static double[] merge(double[] arr,double[] arr2){
        double[] result= {};

        for (double i : arr) {
            result= ArraysUtility.addElement(result,i);
        }
        for (double i : arr2) {
            result= ArraysUtility.addElement(result,i);

        }
        return result;
    }

    //Merge two arrays and return a new array.
    public static char[] merge(char[] arr,char[] arr2){
        char[] result= {};

        for (char i : arr) {
            result= ArraysUtility.addElement(result,i);
        }
        for (char i : arr2) {
            result= ArraysUtility.addElement(result,i);

        }
        return result;
    }

    //Merge two arrays and return a new array.
    public static String[] merge(String[] arr,String[] arr2){
        String[] result= {};

        for (String i : arr) {
            result= ArraysUtility.addElement(result,i);
        }
        for (String i : arr2) {
            result= ArraysUtility.addElement(result,i);

        }
        return result;
    }


    //Reverse the given Array and returns the Array.
    public static int[] reverseArray(int[] arr){
        int[] result={};
        for (int i = arr.length-1; i >=0; i--) {
            result= ArraysUtility.addElement(result,arr[i]);

        }
        return result;
    }

    //Reverse the given Array and returns the Array.
    public static double[] reverseArray(double[] arr){
        double[] result={};
        for (int i = arr.length-1; i >=0; i--) {
            result= ArraysUtility.addElement(result,arr[i]);

        }
        return result;
    }

    //Reverse the given Array and returns the Array.
    public static char[] reverseArray(char[] arr){
        char[] result={};
        for (int i = arr.length-1; i >=0; i--) {
            result= ArraysUtility.addElement(result,arr[i]);

        }
        return result;
    }

    //Reverse the given Array and returns the Array.
    public static String[] reverseArray(String[] arr){
        String[] result={};
        for (int i = arr.length-1; i >=0; i--) {
            result= ArraysUtility.addElement(result,arr[i]);

        }
        return result;
    }


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


    //Remove dublicated elements of the array.
    public static int[] removeDublicates(int[] arr){
        int[] result={};
        for (int i : arr) {
            if (!ArraysUtility.contains(result,i)){
                result=ArraysUtility.addElement(result,i);
            }

        }
        return result;
    }

    //Remove dublicated elements of the array.
    public static double[] removeDublicates(double[] arr){
        double[] result={};
        for (double i : arr) {
            if (!ArraysUtility.contains(result,i)){
                result=ArraysUtility.addElement(result,i);
            }

        }
        return result;
    }

    //Remove dublicated elements of the array.
    public static char[] removeDublicates(char[] arr){
        char[] result={};
        for (char i : arr) {
            if (!ArraysUtility.contains(result,i)){
                result=ArraysUtility.addElement(result,i);
            }

        }
        return result;
    }

    //Remove dublicated elements of the array.
    public static String[] removeDublicates(String[] arr){
        String[] result={};
        for (String i : arr) {
            if (!ArraysUtility.contains(result,i)){
                result=ArraysUtility.addElement(result,i);
            }

        }
        return result;
    }








}
