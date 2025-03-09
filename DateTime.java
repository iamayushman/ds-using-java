import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTime {
    public static void main(String[] args) {
        LocalDate date= LocalDate.now();
        System.out.println(date.getDayOfYear());
    }
}
