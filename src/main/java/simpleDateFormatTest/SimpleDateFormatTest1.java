package simpleDateFormatTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author HouZ.
 * Date: 2017/8/16,
 * Time: 23:42,
 * phone:17621373690
 */
public class SimpleDateFormatTest1 {
    public static void main(String[] args) {
        /*Date to String*/
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("Gyyyy年中第D天");
        String dateStr1 = sdf.format(date);
        System.out.println(dateStr1);

        /*String to Date*/
        String dateStr2 = "17-8-16";
        SimpleDateFormat sdf2 = new SimpleDateFormat("y-MM-d");
        try {
            System.out.println(sdf2.parse(dateStr2));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
