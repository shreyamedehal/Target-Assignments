import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class CurrentDateTime {
    public static void main(String[] args) {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss z");
        Date date = new Date();
        formatDate.setTimeZone(TimeZone.getTimeZone("IST"));
        System.out.println(formatDate.format(date));
    }
}
