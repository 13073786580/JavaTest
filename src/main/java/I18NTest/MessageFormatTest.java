package I18NTest;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Author HouZ.
 * Date: 2017/8/1,
 * Time: 21:27,
 * phone:17621373690
 */
public class MessageFormatTest {
    public static void main(String[] args) {
        Locale locale = null;
        if (args.length == 2) {
            locale = new Locale(args[0], args[1]);
        } else {
            locale = Locale.getDefault(Locale.Category.FORMAT);
        }

        ResourceBundle bundle = ResourceBundle.getBundle("myMess", locale);
        String s = bundle.getString("msg");
        System.out.println(MessageFormat.format(s, "HouZ", new Date()));
        /*String[] strings = new String[2];
        strings[0] = "heihei";
        strings[1] = new Date().toString();
        String msg = messageFormatMethod(strings);
        System.out.println(msg);*/
    }
}
