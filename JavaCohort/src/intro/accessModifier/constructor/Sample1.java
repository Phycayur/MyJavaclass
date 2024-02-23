package intro.accessModifier.constructor;

public class Sample1 {
    String myName;
    public Sample1(){

        System.out.println("I am a Costructor");
    }
    public Sample1(String name){
        myName =name;
    }
    public static void main (String[]args){
        Sample1 sample1 = new Sample1();
        Sample1 sample = new Sample1("Bolaji");
        System.out.println("My Name is " + sample.myName);
        Sample2 sample2 = new Sample2();
        //Sample3 sample3 = new Sample2();
    }
}
class Sample2{
    public Sample2(){
        System.out.println("I am a constructor from Sample2");
    }
}