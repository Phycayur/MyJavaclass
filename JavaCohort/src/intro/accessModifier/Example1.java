package intro.accessModifier;

import intro.accessModifier2.Example4;

public class Example1 extends Example2 {
    public int num1 =45;
    protected  int num2 =12;
    private int num3 = 90;
            int num4 = 32;
    public static void main(String[]args){
 Example2 example2 = new Example2();
 Example1 example1 = new Example1();
    System.out.println("Accessible Public variable"+example2.num1);
        System.out.println("Accessible Protected variable"+example2.num2);
        //System.out.println("Accessible private variable"+example2.num3);
        System.out.println("Accessible Public variable"+example2.num4);
        //System.out.println("Accessible private variable"+example1.salary2);
       //I commented this out to avoid the error
        // System.out.println("Accessible Public variable"+example1.salary1);
        //System.out.println("Accessible protected variable"+example1.salary3);
        //System.out.println("Accessible Public variable"+example1.salary4);
    }
}
class Example2 {


    public int num1 = 45;
    protected int num2 = 12;
    private int num3 = 90;
    int num4 = 32;
}
class Example3 {
public double salary1 = 1000000.9; private double salary2= 250000.21;protected double salary3 =524.20;double salary4 = 21.00;


}