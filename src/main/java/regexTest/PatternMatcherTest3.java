package regexTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 利用正则表达式实现替换
 * Author Edison Hou.
 * Date: 2017/7/26,
 * Time: 23:30,
 * phone:17621373690
 */
public class PatternMatcherTest3 {
    public static void main(String[] args) {
        String[] strings = {
            "i am your father",
            "he is your mather",
            "this old man is your grandfather"
        };
        String regex = "th\\w+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = null;
        for (String s : strings) {
            if (matcher == null) {
                matcher = pattern.matcher(s);
            } else {
                matcher.reset(s);
            }
            System.out.println(matcher.replaceAll("fuck"));
        }
    }
}
