package intro.Array;

import java.util.Scanner;
public class Asst2 {
    public static void  main(String[]args){

        Scanner number = new Scanner(System.in);
        System.out.println("Input a num");
        int num;
        num =number.nextInt();
        if (num > 0)
        {
        System.out.println("The number you Entered is a positive number");}
        else if (num < 0){
            System.out.println("Hey you have entered a negative number");

        }

           }
}
