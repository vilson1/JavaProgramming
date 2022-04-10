package day24;

public class ReturnMethodPractice2 {
    public static void main(String[] args) {
        String str=grade(90);
        if (str=="A")
        {
            System.out.println("Exellent");
        }
        else if (str=="B"){
            System.out.println("Great");
        }
        else if (str=="C"){
            System.out.println("Good");
        }
        else if (str=="D"){
            System.out.println("Passed");
        }
        else
            System.out.println("Try again");

    }
//Criate a function that can calculate dhe grade.
    public static String grade(int score){
        String result="";
        if (score>100 && score<0)
            result="Invalid";
        else{
            result=(score>90)?"A":(score>80)?"B":(score>70)?"C":(score>60)?"D":"E";
        }
        return result;
    }
}
