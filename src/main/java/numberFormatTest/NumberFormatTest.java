package numberFormatTest;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * 利用NumberFormat类来转换字符串与数字
 *
 * Author HouZ.
 * Date: 2017/8/9,
 * Time: 23:32,
 * phone:17621373690
 */
public class NumberFormatTest {
    public static void main(String[] args) {
        double d = 123.45;
        //创建环境数组
        Locale[] locales = {Locale.CHINA, Locale.US};
        //创建NumberFormat对象初始化数组
        NumberFormat[] numberFormats = new NumberFormat[6];
        //获得NumberFormat实体
        for (int i = 0; i < locales.length; i++) {
            //获得通用数值格式对象
            numberFormats[i*3] = NumberFormat.getNumberInstance(locales[i]);
            //获得百分比格式对象
            numberFormats[i*3 + 1] = NumberFormat.getPercentInstance(locales[i]);
            //获得货币格式对象
            numberFormats[i*3 + 2] = NumberFormat.getCurrencyInstance(locales[i]);
        }

        for (int i = 0; i < locales.length; i++) {
            String pre = i == 0?"=====中国的格式=====" : i == 1?"=====美国的格式=====" : "=====未知格式=====";
            System.out.println(pre);

            System.out.println("通用的：" + numberFormats[i*3].format(d));

            System.out.println("百分比的：" + numberFormats[i*3 + 1].format(d));

            System.out.println("货币的：" + numberFormats[i*3 + 2].format(d));
        }
    }
}
