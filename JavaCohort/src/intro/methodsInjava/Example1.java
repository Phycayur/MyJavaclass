package intro.methodsInjava;

public class Example1 {

           public double checkMax (double sal1,double sal2, double sal3){
            double maximumNumber= Math.max(sal1,(Math.max(sal2,sal3)));
            return maximumNumber;
        }
    }

