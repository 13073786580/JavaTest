package dateFormatTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/**
 * Author HouZ.
 * Date: 2017/8/16,
 * Time: 23:09,
 * phone:17621373690
 */
public class DateFormatTest2 {
    public static void main(String[] args) {
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.CHINA);
        //采用严格的时间规则，如时间：2017-2-31日，在转换时将会抛出异常;
        //Lenient的意思是宽松的，形容词；所以我们应该设置参数为false
        dateFormat.setLenient(false);

        /*
        该段代码将报ParseException异常
        String dateStr1 = "2017-2-31";
        try {
            Date date = dateFormat.parse(dateStr1);
            System.out.println(date.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }*/

        /*
        该段代码同样会报错，因为上方我们设置的格式器的样式为SHORT，即“2017-8-16”格式
        而这里采用的是LONG格式的内容

        String dateStr2 = "2017年8月16日";
        try {
            Date date = dateFormat.parse(dateStr2);
            System.out.println(date.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }*/

        String dateStr3 = "2017-8-16";
        try {
            Date date = dateFormat.parse(dateStr3);
            System.out.println(date.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
