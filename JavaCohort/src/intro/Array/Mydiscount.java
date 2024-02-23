package intro.Array;
import java.util.Scanner;
public class Mydiscount {
    public static void main(String[] args) {
        Scanner Discunt = new Scanner(System.in);
        System.out.println("Input price here :");
//int amount ;
//double discount;
      int  amount = Discunt.nextInt();
switch (amount){
    case 50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100:

        double price = amount * 0.05;
        System.out.println("Your Purchase Amount is :"+ " " + amount);
        System.out.println("Discount Allowed for this price:"+ " " + price);
        break;

    case 101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150:
         price = amount * 0.10;
        System.out.println("Your Purchase Amount is :"+ " " + amount);
        System.out.println("Discount Allowed for this price:"+ " " + price);
        break;

    default:
        System.out.println("Your Purchase Amount is :"+ " " + amount);
        System.out.println("Sorry no Discount allowed for sales less than 50");
    }
    }
}
