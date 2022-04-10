package Day26;

import utilities.ArraysUtility;

public class RemoveElement2 {
    public static int[] removeElement(int[] arr, int index){
        int[] result={};
        for (int i = 0; i < arr.length; i++) {
            if (i!=index){
                result= ArraysUtility.addElement(arr,index);
            }
            
        }
        return result;
    }
}
