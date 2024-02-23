// This is used to accept input from the console to make it interactive using the scanner command
package intro;
import java.util.Scanner;
public class Day6 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your firstname");
        String firstname =scanner.nextLine();
        //Middlename
        System.out.println("What is your middlename");
        String middlename =scanner.nextLine();
        // Surname
        System.out.println("What is your surname");
        String surname =scanner.nextLine();
        System.out.println("Your fullname as provided is "+ firstname+ " "+ middlename+ " "+surname);


    }
}
