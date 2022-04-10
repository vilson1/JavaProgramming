package day20.day21;

public class UniqueElement {
    public static void main(String[] args) {
        String[] words={"Layan","Layan", "Oleksander","Olga","Adan","Adan","Adan","Cihad","Cihad","Cihad","Cydeo"};


        for (String each : words) {
            int count=0;

            for (String i : words) {
                if (i.equals(each))
                {
                    count++;
                }


            }
            if (count==1)
            {
                System.out.println(each);
            }

        }

    }
}
