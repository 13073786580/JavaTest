package I18NTest;

import java.util.Locale;

/**
 * Author Edison Hou.
 * Date: 2017/7/27,
 * Time: 22:19,
 * phone:17621373690
 */
public class Test1 {
    public static void main(String[] args) {
        Locale[] locales = Locale.getAvailableLocales();
        for (Locale locale : locales) {
            System.out.println("============");
            System.out.println(locale.getDisplayCountry());
            System.out.println(locale.getCountry());
            System.out.println(locale.getDisplayLanguage());
            System.out.println(locale.getLanguage());
        }
    }

    public String test() {
        return "hahah";
    }
}
