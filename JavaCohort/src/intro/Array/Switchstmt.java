package intro.Array;

import java.util.Scanner;

public class Switchstmt {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a color");
        String color = sc.nextLine();
        switch (color){
            case "red":
                System.out.println("Up Man U");
                break;
            case "blue":
                System.out.println("Up Shooting");
                break;
            case "white":
                System.out.println("Up Celestial");
                break;
            default:
                System.out.println("Unknown Team");
                break;
        }
    }
}
