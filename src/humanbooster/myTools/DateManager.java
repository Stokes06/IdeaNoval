package humanbooster.myTools;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DateManager {

    public static String formatDate(Date d)
    {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(d);
    }
}
