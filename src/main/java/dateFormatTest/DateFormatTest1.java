package dateFormatTest;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Author HouZ.
 * Date: 2017/8/16,
 * Time: 22:23,
 * phone:17621373690
 */
public class DateFormatTest1 {
    public static void main(String[] args) {
        //获得一个日期格式器
        //DateFormat dateFormat = DateFormat.getDateInstance();
        //获得一个时间格式器
        //DateFormat dateFormat1 = DateFormat.getTimeInstance();
        //获得一个日期时间格式器
        //DateFormat dateFormat2 = DateFormat.getDateTimeInstance();

        Date date = new Date();
        //中国和美国
        Locale[] locales = {Locale.CHINA, Locale.US};
        DateFormat[] dateFormats = new DateFormat[16];
        //循环创建各种格式的时间格式器
        for (int i = 0; i < locales.length; i++) {
            dateFormats[i*8] = DateFormat.getDateInstance(DateFormat.SHORT, locales[i]);
            dateFormats[i*8 + 1] = DateFormat.getDateInstance(DateFormat.MEDIUM, locales[i]);
            dateFormats[i*8 + 2] = DateFormat.getDateInstance(DateFormat.LONG, locales[i]);
            dateFormats[i*8 + 3] = DateFormat.getDateInstance(DateFormat.FULL, locales[i]);
            dateFormats[i*8 + 4] = DateFormat.getTimeInstance(DateFormat.SHORT, locales[i]);
            dateFormats[i*8 + 5] = DateFormat.getTimeInstance(DateFormat.MEDIUM, locales[i]);
            dateFormats[i*8 + 6] = DateFormat.getTimeInstance(DateFormat.LONG, locales[i]);
            dateFormats[i*8 + 7] = DateFormat.getTimeInstance(DateFormat.FULL, locales[i]);
        }
        //根据不同格式器输出格式后的日期
        for (int i = 0; i < locales.length; i++) {
            String s = i == 0 ? "=====中国时间=====" : "=====美国时间=====";
            System.out.println(s);
            System.out.println("SHORT格式的日期格式：" + dateFormats[i*8].format(date));
            System.out.println("MIDIUM格式的日期格式：" + dateFormats[i*8 + 1].format(date));
            System.out.println("LONG格式的日期格式：" + dateFormats[i*8 + 2].format(date));
            System.out.println("FULL格式的日期格式：" + dateFormats[i*8 + 3].format(date));
            System.out.println("SHORT格式的时间格式：" + dateFormats[i*8 + 4].format(date));
            System.out.println("MEDIUM格式的时间格式：" + dateFormats[i*8 + 5].format(date));
            System.out.println("LONG格式的时间格式：" + dateFormats[i*8 + 6].format(date));
            System.out.println("FULL格式的时间格式：" + dateFormats[i*8 + 7].format(date));
        }

    }
}
