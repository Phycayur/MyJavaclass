package intro;

public class Hw {
    int hgt = 5,radi = 4;
    double rt = 3.142;
    public static void main (String[]args){
        Hw hw = new Hw();
        int prod = (( hw.hgt*hw.hgt)*(hw.radi*hw.radi));
        double pr = (hw.rt * hw.radi);
        System.out.println("The area of the Cone is = "+ ((pr * hw.radi) * (hw.radi + (Math.sqrt(prod)))));
        Hw.Noe();
        //Hw.parallel();
          }
    public static void Noe (){
        //Area of a Rhombus
    int d = 5;
    double Area = (d*d) /2;
            System.out.println(Area);
    }

}

