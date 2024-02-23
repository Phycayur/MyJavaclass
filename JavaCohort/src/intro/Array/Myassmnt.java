package intro.Array;
import java.util.Scanner;
public class Myassmnt {
    public static void main (String[]args){

        Scanner mynum = new Scanner(System.in);
        System.out.println("Input a number :");
        int num = 0;
        num = mynum.nextInt();
        switch (num){

            case -1,-2,-3,-4,-5,-6,-7,-8,-9:

                System.out.println("This is a negative number");
                break;

            default:
                System.out.println("This is a Positive number");
                break;

        }
    }

}
