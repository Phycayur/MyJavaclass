package intro;

public class Day5 {
    int a = 2, b =3, c= 4;

    public static void main (String[]args){
        //Concantinating
        //String firstname ="Olokun";
        //String lastname = "Okikiolu";
        //String Middlename = "Olomu";
        //System.out.println("My name is " +firstname+"-"+lastname+ " " +Middlename);
        //System.out.println("My name is " +Middlename+"/"+lastname+ " - " +Middlename);
        Day5 x = new Day5();
        int dem = (2 * x.a);
        int num=(4 * x.a * x.c);
        double quad = (x.b * x.b -num/dem);
        //System.out.println(dem);
        //System.out.println(num);
        //System.out.println(x.b* x.b -num/dem);
        //System.out.println(quad);
        //System.out.println((Math.sqrt(quad)/x.a*2));// Why does it give me NaN (Not A Number NaN)Sir ?
        System.out.println("The Value x when +ve " +((-x.b)+(Math.sqrt(quad))));
        System.out.println("The Value x when -ve is " +((-x.b)-(Math.sqrt(quad))));
        //System.out.println(asg.num1+ " * " + asg.num11+ " = "+(asg.num1 * asg.num11));
        //public void math(){
        //System.out.println(Math.pow(b,2));
       //System.out.println();
    }
}
