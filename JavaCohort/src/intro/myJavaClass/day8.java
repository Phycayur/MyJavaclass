package intro.myJavaClass;
import java.util.Scanner;
public class day8 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your Score");
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

