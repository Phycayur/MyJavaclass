package intro;

public class Stringpackage {
    public static void main(String []args){
        String food = new String("Amala");
        String soup = "Ewedu";
        String diet = food.concat(" and Ewedu");
        System.out.println("My best food is "+diet);
        System.out.println("My best meal is " +food+" and "+soup);//use concat or + to join more than 2 stmt
char [] name ={'a','b','i','o','l','a'};
String adc = new String(name);
System.out.println(adc);
String ch =new String(name, 2 ,4);
        System.out.println(ch);
        System.out.println(diet.substring(4)); //use to set the number of xter in the word diet to 4
        System.out.println(diet.substring(1,9)); //use to set num of xter in diet starting from 0
        System.out.println(diet.indexOf("u"));//use in array of an element
        System.out.println(diet.indexOf("a"));//use in array of an element to pick the first num
        System.out.println(diet.lastIndexOf("a"));//use in array of an element
        String state = "  oyo state ";
        System.out.println(state.trim());// use to remove blank space in a program.
    }
}
