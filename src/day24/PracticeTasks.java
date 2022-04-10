package day24;

public class PracticeTasks {
    public static void main(String[] args) {
        initialsOfPerson("Vilson","Shehu");
        domainOfEmail("Vilson.shehu@outlook.com");
        monthName(12);
        dayName(4);
        monthDay("December");


    }

    //Create a method that displays the initials of a person
    //method that can display a domain of the email.
    //create a method that can give the name of the month based on the given number
    //create a method that can print the name of the day based on the given number.
    //create a method that can print how many days does a month has.

    public static void initialsOfPerson(String firstName, String lastName){
        String initials=""+firstName.charAt(0)+"."+lastName.charAt(0);
        System.out.println(initials);

    }
    public static void domainOfEmail(String email){
        String domain=email.substring(email.lastIndexOf("@"+1));
        System.out.println(domain);
    }
    public static void monthName(int monthNumber ){
        String month="";
        switch (monthNumber){
            case 1:
                month="January";
                break;
            case 2:
                month="February";
                break;
            case 3:
                month="March";
                break;
            case 4:
                month="April";
                break;
            case 5:
                month="May";
                break;
            case 6:
                month="June";
                break;
            case 7:
                month="July";
                break;
            case 8:
                month="August";
                break;
            case 9:
                month="September";
                break;
            case 10:
                month="October";
                break;
            case 11:
                month="November";
                break;
            case 12:
                month="December";
                break;
        }
        System.out.println(month);

    }
    public static void dayName(int dayNumber){
        String day="";
        switch (dayNumber){
            case 1:
                day="Monday";
                break;
            case 2:
                day="Tuesday";
                break;
            case 3:
                day="Wednesday";
                break;
            case 4:
                day="Thursday";
                break;
            case 5:
                day="Friday";
                break;
            case 6:
                day="Saturday";
                break;
            case 7:
                day="Sunday";
                break;
        }
        System.out.println(day);
    }
    public static void monthDay(String month){
        int days=0;
        switch (month){
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                days=31;
            break;
            case "February":
                days=28;
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                days=30;
                break;
        }
        System.out.println(days);

    }
}
