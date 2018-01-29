package DataTimeFormatTest_JDK_18;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Author HouZ.
 * Date: 2017/8/17,
 * Time: 22:32,
 * phone:17621373690
 */
public class DateTimeFormatTest {
    public static void main(String[] args) {
        /*创建不同格式的DateTimeFormatter对象数组*/
        DateTimeFormatter[] formatters = new DateTimeFormatter[] {
            //直接使用常量创建DateTimeFormatter对象
            DateTimeFormatter.ISO_LOCAL_DATE,
            DateTimeFormatter.ISO_LOCAL_TIME,
            DateTimeFormatter.ISO_LOCAL_DATE_TIME,
            //使用本地化的不同风格创建
            DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM),
            DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG),
            //根据模式字符串来创建
            DateTimeFormatter.ofPattern("Gyyyy-MMM-dd HH:mm:ss")
        };
        /*创建当前时间对象*/
        LocalDateTime localDateTime = LocalDateTime.now();
        /*循环将不同格式的当前时间装换为字符串输出*/
        for (int i = 0; i < formatters.length; i++) {
            /*如下两行的效果相同*/
            System.out.println(localDateTime.format(formatters[i]));
            System.out.println(formatters[i].format(localDateTime));
        }
    }
}
