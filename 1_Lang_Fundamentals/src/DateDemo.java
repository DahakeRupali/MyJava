
import java.util.Calendar;
import java.util.Date;
public class DateDemo {
 public static void main(String[] arsgs) {
     Date dt =   new Date();
     System.out.println("Today is : " + dt);
     // getinstance methods why not new ??
     Calendar cal = Calendar.getInstance();
     cal.add(Calendar.DAY_OF_MONTH, 5);
     // Output in non readable form
     System.out.println("Afeter 5 days.... " +  cal.DAY_OF_MONTH);
    }
}