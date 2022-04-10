package day24;

public class ReturnMethodPractice {
    public static void main(String[] args) {
     int maxi=   maxNumber(100,200);
     int mult= maxi*2;
        System.out.println(mult);

    }
    public static int maxNumber(int a, int b){
        int max;
        if (a>b)
            max=a;
        else
            max=b;

        return max;

    }
}
