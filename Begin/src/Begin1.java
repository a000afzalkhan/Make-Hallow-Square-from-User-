import java.util.Scanner;

public class Begin1 {

    public static void main(String[] args) {



        Scanner user = new Scanner(System.in);


        System.out.println("Enter number of Rows = ");
        int u = user.nextInt();


        System.out.println("Enter number of Columb = ");
        int i = user.nextInt();

        for (int row = 1; row <=u ; row++) {

            for (int col = 1; col <=i ; col++) {

                if(row == 1 || row==u || col==1 || col==i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }



}

