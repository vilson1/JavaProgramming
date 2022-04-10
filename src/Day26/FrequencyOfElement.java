package Day26;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,5,66,1,2,3};
        System.out.println(frequencyOfElement(arr,5));
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


}
