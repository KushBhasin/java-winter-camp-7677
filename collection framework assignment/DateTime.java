import java.text.DateFormat;
import java.util.*;

public class DateTime {
    static void Time_formats(Date date_time) {
        Locale England_time = new Locale("en", "ch");
        DateFormat de = DateFormat.getDateInstance(DateFormat.FULL, England_time);
        System.out.println("The England Format is: " + de.format(date_time));
        Locale Italy_time = new Locale("it", "ch");
        DateFormat di = DateFormat.getDateInstance(DateFormat.FULL, Italy_time);
        System.out.println("The Italian Format is: " + di.format(date_time));
    }

    public static void main(String[] args) throws Exception {
        System.out.println("The required packages have been imported");
        Date date_time = new Date();
        System.out.println("A date object has been defined");
        Time_formats(date_time);
    }
}