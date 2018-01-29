package regexTest;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 利用Matcher替换第一个匹配的字符串
 * Author Edison Hou.
 * Date: 2017/7/26,
 * Time: 23:40,
 * phone:17621373690
 */
public class PatternMatcherTest4 {
    public static void main(String[] args) {
        String[] strings = {
                "i am your father father",
                "he is your mather mather",
                "this old man is your grandfather"
        };
        String regex = "th\\w*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = null;
        for (String s : strings) {
            if (matcher == null) {
                matcher = pattern.matcher(s);
            } else {
                matcher.reset(s);
            }
            System.out.println(matcher.replaceFirst("fuck"));
            System.out.println(Arrays.toString(s.split(" ")));
        }
    }
}
