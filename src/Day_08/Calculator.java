package Day_08;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE

        System.out.println("Enter your property type:");
        String propertyType=scan.nextLine();
        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms= scan.nextInt();
        System.out.println("Do you have a backyard?");
        backyard=scan.nextBoolean();
        System.out.println("Do you have garage?");
        garage=scan.nextBoolean();
        System.out.println("How many spots?");
        garageSpots=scan.nextInt();
        System.out.println("How close is metro station?");
        metroAccessibility=scan.nextFloat();
        System.out.println("How close is highway?");
        highwayAccessibility=scan.nextFloat();
        System.out.println("What's the rating of nearest school?");
        schoolScore=scan.nextFloat();
        System.out.println("Does any of your family members smoking?");
        smoking=scan.nextBoolean();

        System.out.println("Market report has been generated.");

        if(propertyType=="Condo") {
            propertyPrice = 50000;

            propertyPrice = 50000 + numberOfBedrooms * 30000;

            if (garageSpots > 0 && garageSpots <= 10) {
                propertyPrice = propertyPrice + garageSpots * 20000;
            } else
                System.out.println("Pardon, it's not public parking");

            if (metroAccessibility < 1)
                propertyPrice = propertyPrice + 1500;
            else if (metroAccessibility >= 1 && metroAccessibility <= 5)
                propertyPrice = propertyPrice + 8000;
            else if (metroAccessibility > 5 && metroAccessibility <= 20)
                propertyPrice = propertyPrice + 4000;
            else
                propertyPrice = propertyPrice + 0;
            if (schoolScore <= 10) {
                if (schoolScore <= 8)
                    propertyPrice = propertyPrice + 45000;
                else if ((schoolScore >= 4))
                    propertyPrice = propertyPrice + 20000;
                else
                    propertyPrice = propertyPrice + 5000;
            }
            if (smoking)
                propertyPrice = propertyPrice - 5000;
        }

            else if(propertyType=="Townhouse") {
                    propertyPrice = 75000;

                    propertyPrice = 75000 + numberOfBedrooms * 30000;


                    if (backyard && !propertyType.equals("Condo")) {
                        propertyPrice = propertyPrice + 5000;
                    }
                    if (garageSpots > 0 && garageSpots <= 10) {
                        propertyPrice = propertyPrice + garageSpots * 20000;
                    } else
                        System.out.println("Pardon, it's not public parking");

                    if (metroAccessibility < 1)
                        propertyPrice = propertyPrice + 1500;
                    else if (metroAccessibility >= 1 && metroAccessibility <= 5)
                        propertyPrice = propertyPrice + 8000;
                    else if (metroAccessibility > 5 && metroAccessibility <= 20)
                        propertyPrice = propertyPrice + 4000;
                    else
                        propertyPrice = propertyPrice + 0;
                    if (schoolScore <= 10) {
                        if (schoolScore <= 8)
                            propertyPrice = propertyPrice + 45000;
                        else if ((schoolScore >= 4))
                            propertyPrice = propertyPrice + 20000;
                        else
                            propertyPrice = propertyPrice + 5000;
                    }
                    if (smoking)
                        propertyPrice = propertyPrice - 5000;
                }

            else if(propertyType=="Single Family Home") {
            propertyPrice = 95000;

            propertyPrice = 95000 + numberOfBedrooms * 30000;


            if (backyard && !propertyType.equals("Condo")) {
                propertyPrice = propertyPrice + 5000;
            }
            if (garageSpots > 0 && garageSpots <= 10) {
                propertyPrice = propertyPrice + garageSpots * 20000;
            } else
                System.out.println("Pardon, it's not public parking");

            if (metroAccessibility < 1)
                propertyPrice = propertyPrice + 1500;
            else if (metroAccessibility >= 1 && metroAccessibility <= 5)
                propertyPrice = propertyPrice + 8000;
            else if (metroAccessibility > 5 && metroAccessibility <= 20)
                propertyPrice = propertyPrice + 4000;
            else
                propertyPrice = propertyPrice + 0;
            if (schoolScore <= 10) {
                if (schoolScore <= 8)
                    propertyPrice = propertyPrice + 45000;
                else if ((schoolScore >= 4))
                    propertyPrice = propertyPrice + 20000;
                else
                    propertyPrice = propertyPrice + 5000;
            }
            if (smoking)
                propertyPrice = propertyPrice - 5000;
        }
            propertyPrice=propertyPrice;
        System.out.println("Your estimate market price is: "+propertyPrice+"$");





        }




        


    }

