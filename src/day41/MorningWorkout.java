package day41;

public class MorningWorkout {
    public static void main(String[] args) {

        for (int i=1; i<=30;i++) {
            System.out.print("\r Start the push up "+ i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
    public static void sleep(double seconds){
        try {
            Thread.sleep((long)(seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
