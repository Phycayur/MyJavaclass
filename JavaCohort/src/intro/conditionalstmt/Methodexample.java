package intro.conditionalstmt;

public class Methodexample {
public static void main (String []args){
    Methodexample example = new Methodexample();
    int sum = example.addNumbers(12, 46 );
    System.out.println(sum);
    }


public int addNumbers(int a, int b){
    return a+b;
}
public double checkbalance(String accountNumber, String pin){
    double accountBalance = 393939.04;
    return accountBalance;
    }
    public  void greet(String name){
    System.out.println("Hello Dear " +name);
    }
}