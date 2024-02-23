package intro;

public class Day4
{
    int num1 = 20;
    int num2 = 40;
    public  static  void main (String[]args){
        Day4 d4= new Day4();
        String fname = "noke"; String lname= "lokd";
        System.out.println(fname + " " + lname);
        //Concantenating
        System.out.println(d4.num1+ " + " + d4.num2+ " = "+(d4.num1 + d4.num2));
        System.out.println(d4.num1*d4.num2);
        System.out.println(d4.num2-d4.num1);
        System.out.println(d4.num2 % d4.num1);
    }
}
