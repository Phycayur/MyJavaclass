package intro.methodsInjava;

public class Example2 {
    public static void main (String[]args){
        Example2 example2 = new Example2();
        System.out.println("My qualification is"+example2.getQualification()+"Degree2");
    }
    public double checkMax(double sal1,double sal2,double sal3){
        double maximumNumber = Math.max(sal1,(Math.max(sal2,sal3)));
        return maximumNumber;
        //System.out.println("My qualification is"+Example2.);
    }


    public int getScore() {
        return score;
    }

    private int score=34;

    public String getQualification() {
        return qualification;
    }

    public String qualification = "Masters";
}
