package intro.accessModifier2;

public class Inheritance extends part2 {
    public static void main (String[]args){
        Inheritance mine = new Inheritance();
        mine.sector();
        mine.propertyOwned();
       // System.out.println("This is good " +mine.egg() );

    }
}
class part2 extends part3{
    public void sector (){
        System.out.println("I am learning Java");
    }
}
class part3 extends part4{
    public void propertyOwned(){
        System.out.println("I am moving forward");

    }
}
class part4{

    public String getEgg() {
        return egg;
    }

    private String egg = "Edible";
}