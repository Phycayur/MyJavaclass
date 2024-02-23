package intro.Array;
import java.util.Scanner;
public class Mike {
    public static void main(String[]args){
        Scanner number = new Scanner(System.in);
        System.out.println("Input num");
        int num1,num2,num3;
        num1 = number.nextInt();
       num2 = number.nextInt();
       num3= number.nextInt();
        if (num1 > num3 && num1 > num2){
            System.out.println("The largest of the numbers is"+ num1 ); }

        else if (num2 > num3 && num2 > num1){
            System.out.println("The largest of the numbers is"+ num2 ); }

        else if (num3 > num2 && num3 > num1){
            System.out.println("The largest of the numbers is "+ num3 ); }
        }

    }

