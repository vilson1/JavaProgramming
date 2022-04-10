package day03;

public class SalaryCalculator {
    public static void main(String[] args) {
// hourlyRate    //weeklyHours

        int hourlyRate =65;
        int weeklyHours = 45;
        int numbersOfWeeks = 52;

        int salary = hourlyRate * weeklyHours * numbersOfWeeks;

        //System.out.println(salary);

        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("hourlyRate = " + hourlyRate);
        System.out.println("salary =  $" + salary);





    }
}
