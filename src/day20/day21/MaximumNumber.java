package day20.day21;

public class MaximumNumber {
    public static void main(String[] args) {
        int[] number={10,5,4,20,1,0};
        int max=number[0];
        for (int i : number) {
            if (i>max) {
                max=i;
            }

        }
        System.out.println(max);


    }
}
