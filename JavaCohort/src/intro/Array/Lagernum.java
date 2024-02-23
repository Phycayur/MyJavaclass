package intro.Array;
import java.util.Scanner;
public class Lagernum {
    public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Input a number: ");
        int numy = 3;

        numy= sc.nextInt();
  switch (numy){
      case 1:
          System.out.println("This is least number");
          break;
      case 2:
          System.out.println("This is middle number");
          break;
      case 3:
          System.out.println("This is Highest number");
          break;
      default:
          System.out.println("Out of range run the program and try again");
          break;



    }
}}
