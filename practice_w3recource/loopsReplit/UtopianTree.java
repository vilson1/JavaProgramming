package loopsReplit;

public class UtopianTree {
    public static void main(String[] args) {

        int treeSize=0;
        for (int i = 1; i <=10 ; i++) {
            if (i<=3)
            {
                treeSize=i;
                System.out.println("year "+i+" - growth "+1+" cm");
            }
            else
            {
                treeSize+=2;
                System.out.println("year "+i+" - growth "+2+" cm");
            }
            System.out.println("tree size: "+treeSize+"cm" );


        }
    }
}
