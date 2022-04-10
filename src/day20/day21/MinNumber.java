package day20.day21;

public class MinNumber {
    public static void main(String[] args) {
        int[] number={10,5,4,20,1,0};
        int min =number[0];

        for (int i : number) {
            if (i<min)
            {
                min=i;
            }

        }
        System.out.println(min);
    }
}
