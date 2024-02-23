package intro;

public class Day3 {
    int score = 340;
    String name = "Kenny";
    static int num1 = 41;

    public static void main(String[] args) {
        // there are 3 types of variables in Java(Local variables, instance Variables, Static Variables)
// instatiating syntax "className objectName = new className();
        Day3 day3 = new Day3();
        System.out.println(day3.score);
        System.out.println(day3.name);
        Day3.greet();
        day3.bank();
           }
    public static void greet() {
        int age = 45;
                System.out.println(age);
    }
    public void bank(){
        System.out.println("first bank");
        System.out.println(Day3.num1);
    }
}
