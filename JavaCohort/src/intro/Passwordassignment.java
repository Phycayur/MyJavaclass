package intro;
import java.util.Scanner;
public class Passwordassignment {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Firstname");
        String fname = scanner.nextLine();
        System.out.println("Enter your Lastname");
        String lname = scanner.nextLine();
        System.out.println("Enter your State");
        String State = scanner.nextLine();
        System.out.println("Enter your age");
        String age = scanner.nextLine();
        String password = new String("mypassword");
       //String fname="Oduola";
       //String lname= "Kehinde";
       //String State = "oyostate";
       //String age = "49";
        String login = password.concat("mypassword");
       System.out.println("Your password is " );
        System.out.println(password.substring(2,5) +fname.substring(2,3) +lname.substring(2,4) +State.substring(2,3));
    }
}
