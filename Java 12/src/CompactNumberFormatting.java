import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatting {


    public static void main(String[] args)
    {
        System.out.println("Compact Formatting is:");
        NumberFormat count = NumberFormat
                .getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.SHORT);
        count.setMaximumFractionDigits(1);

        System.out.println(count.format(2592) + " count");


        NumberFormat count2 = NumberFormat
                .getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.LONG);
        count2.setMaximumFractionDigits(2);
        System.out.println(count2.format(2011) + " count");
    }


}