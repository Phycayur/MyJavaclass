package intro.datePackage;
import java.util.Date;
import java.util.Calendar;
public class Exampledate {
    public static void main (String []args){
       Date date = new Date();
       System.out.println("Today is " +date);
Calendar c = Calendar.getInstance();
//create array of days while using this function
        String[] daysOfWeek={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","saturday"} ;
        // use -1 to set the days cos array will start from o
System.out.println(daysOfWeek[c.get(Calendar.DAY_OF_WEEK)-1]);
int day= c.get(Calendar.DAY_OF_MONTH);
int month=c.get(Calendar.MONTH)+1;
int year=c.get(Calendar.YEAR);
System.out.println(day+"/"+month+"/"+year);
    }

}
