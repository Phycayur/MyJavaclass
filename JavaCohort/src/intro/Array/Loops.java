package intro.Array;

public class Loops {
    public static void main(String[] args) {
        //char[] letters = {'a', 'b', 'c' };
        //for (char letter: letters) {
          //  System.out.println(letter + ", ");

      //  }

    int [] Totals = {10,20,30,40,50 };
    int sum=0;
    for (int Total: Totals){
        sum +=Total;
    }
        System.out.println( "the sum of the number is " +sum);
}
}