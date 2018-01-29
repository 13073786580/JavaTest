package DataTimeFormatTest_JDK_18;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Author HouZ.
 * Date: 2017/8/17,
 * Time: 23:04,
 * phone:17621373690
 */
public class test2 {
    public static void main(String[] args) {
        /*example 1*/
        String dateStr1 = "2017-08-18 18-18-18";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
        LocalDateTime localDateTime1 = LocalDateTime.parse(dateStr1, dateTimeFormatter1);
        System.out.println(localDateTime1);

        /*example 2*/
        String dateStr2 = "2017年08月18日 23时12分";
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy年M月dd日 HH时mm分");
        LocalDateTime localDateTime2 = LocalDateTime.parse(dateStr2, dateTimeFormatter2);
        System.out.println(localDateTime2);
    }
}
