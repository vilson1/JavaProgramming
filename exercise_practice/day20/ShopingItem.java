package day20;

public class ShopingItem {
    public static void main(String[] args) {
        /*3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods",
                "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,
                439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,
                12350};
        1. find out the first index number of "Gloves"
        2. find out if "iPad" is contained in the item list
        3. Print the report of each shopping item
        name - price - #ID*/

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods",
                "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,
                439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,
                12350};

        int index=0;
        for (String item : items) {
            if (item.equals("Gloves"))
            {
                break;
            }
         index++;


        }
        System.out.println(index);
        for (String item : items) {
            if (item.equals("iPad"))
                System.out.println(true);
        }
        for (int i = 0; i < items.length; i++) {
            System.out.println("Name= "+items[i]+", Price= "+prices[i]+", itemId= "+itemIDs[i]);

        }


    }
}
