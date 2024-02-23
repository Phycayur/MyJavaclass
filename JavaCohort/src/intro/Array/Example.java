package intro.Array;

public class Example
{public static void main (String[]args){

    //Array permits you to store more than one value with a name
// syntax 1 array
    //data -type [] arrayName= {Elements}
    // a single dimensional array
    String [] name = {"Qazeem","Kenny","ETC","Oduola","Bolaji","Qaniah"};
    String [] fruits ={"watermelon","Orange","Banana","kiwi"} ;
    int [] age = {75,45,20,18};
        System.out.println(name[3]+"-"+name[5]);
    System.out.println(fruits[0]+"-"+fruits[2]);
    System.out.println(fruits.length);
    //System.out.println(fruits.);
    System.out.println(age.length);
    int sum,ave;
    sum = age[0]+age[1]+age[2]+age[3];
    ave = sum/age.length;
    System.out.println("The average age" +" " + " is " + ave);

}
}
