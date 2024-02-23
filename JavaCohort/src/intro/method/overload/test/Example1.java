package intro.method.overload.test;

public class Example1 {
    public static void main(String[]args){
Example1 example1 = new Example1();
example1.greet();
example1.greet( "Kenny");
        System.out.println("Good Evening " +example1.greet("Oduola","Kehinde"));
    }
    public void greet(){
        System.out.println("Good Evening");
    }
   public void greet(String name){
        System.out.println("Good Evening " +name);

   }
    public String greet(String firstname, String lastname ){
        return firstname+" "+lastname;
    }

}
