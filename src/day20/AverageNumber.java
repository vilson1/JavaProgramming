package day20;

public class AverageNumber {
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50,60};
        int sum=0;
        for (int i : numbers) {
            sum+=i;

        }
        double average=sum/numbers.length;
        System.out.println(average);
    }
}
