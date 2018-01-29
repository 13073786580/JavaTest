package I18NTest;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Author HouZ.
 * Date: 2017/7/27,
 * Time: 23:16,
 * phone:17621373690
 */
public class Test2 {
    public static void main(String[] args) {
        /*Tips:国际化的配置文件需要放在classpath下才能被获取到，
        * 另外，我们可以在控制面板将区域和语言改为对应国家，
        * 即可测试国际化效果*/

        //取得系统默认的国家/语言环境
        Locale myLocale = Locale.getDefault(Locale.Category.FORMAT);
        //根据指定的环境加载资源文件
        ResourceBundle bundle = ResourceBundle.getBundle("mess", myLocale);
        //打印从资源文件中取得的消息
        System.out.println(bundle.getString("hello"));
    }



    /**
     * @Description 测试方法注释
     *
     * @Author HouZ
     * @date 2017/7/28
     * @Time 0:05
     * @param [ss]
     * @return java.lang.String
     */
    public String testMethod(String ss) {
        String s = ss;
        return s;
    }

    /**
     * Test method 2 string.
     *
     * @param s1 the s 1
     * @param s2 the s 2
     * @return the string
     */
    public String testMethod2(String s1, String s2) {
        String s3 = s1 + s2;
        return s3;
    }
}
