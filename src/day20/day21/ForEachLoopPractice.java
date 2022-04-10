package day20.day21;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        String[] words={"Java Programing","Cydeo School", "Wooden Spoon", "Early Birds","Angry Birds"};
        for (String i:words)
        {
            System.out.println(""+i.charAt(0)+i.charAt(i.length()-1));
        }
    }
}
