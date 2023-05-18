import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DayPeriodSupport {
    public static void main(String[] args) {
        //The code can now give output as 3 in the afternoon, and We can use the “B“, “BBBB“, or “BBBBB” DateTimeFormatter pattern for short, full, and narrow styles respectively.
        LocalTime date = LocalTime.parse("15:25:08.690791");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h B");
        System.out.println(date.format(formatter));
    }
}
