package intro.accessModifier2;

import intro.accessModifier.Example1;

public class Example4 {
    public double salary5 = 3443.9; //private double salary6 =234.21;
    protected double salary7 = 829.09; double salary8=23.1;
    public static void main(String[]args){
        Example1 example1 = new Example1();
        System.out.println("Accessing public variable " +example1.num1);
        // I comment this out to allow the public work.
        //System.out.println("Accessing private variable " +example1.num3);
       // System.out.println("Accessing protected variable " +example1.num2);
        //System.out.println("Accessing default variable " +example1.num4);
    }

}
