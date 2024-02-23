package intro.conditionalstmt;
import java.util.Scanner;
public class Stmt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your score");
        int score = scanner.nextInt();
        if (score < 40) {
            System.out.println("Your score is F");
        }
       else if (score >= 40  && score <45 ){
           System.out.println("Your score is E");
       }
        else if (score >= 46  && score <50 ){
            System.out.println("Your score is DE");
        }
        else if (score >= 51  && score <55 ){
            System.out.println("Your score is C");
        }
        else if (score >= 56  && score <60 ){
            System.out.println("Your score is B");
        }
        else if (score >= 70  && score <75 ){
            System.out.println("Your score is A");
        }
    }
}
