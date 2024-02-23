package intro.Array;
import java.util.Scanner;
public class Asst3<Amount> {
    public static void main(String[] args) {
        Scanner dint = new Scanner(System.in);
        System.out.println("Input Amount :");
        Double Amount, price, Discount;
        Amount = dint.nextDouble();
        if (Amount > 100) {
            Discount = 0.10 * Amount;
            System.out.println("Your Purchase Amount is :"+ " " + Amount);
            System.out.println("Discount Allowed for this price:"+ " " +Discount);
        }
        else if (Amount >= 50 && Amount <= 100) {
            Discount = 0.05 * Amount;
            System.out.println("Your Purchase Amount is :"+ " " + Amount);
            System.out.println("Discount Allowed for this price:"+ " " +Discount);}

        else if (Amount< 50)
        {
            System.out.println("Your Purchase Amount is :"+ " " + Amount);
            System.out.println("Sorry no Discount allowed for sales less than 50");
        }


        }


    }

