package regexTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 简单验证邮箱格式
 * Author Edison Hou.
 * Date: 2017/7/26,
 * Time: 23:01,
 * phone:17621373690
 */
public class PatternMatcherTest2 {
    public static void main(String[] args) {
        String[] strings = {
            "43138199@qq.com",
            "asdffsadf@gmail.com",
            "housc@i2finance.net",
            "asdfasd@asd.xx"
        };
        String mailRegex = "\\w{3,20}@\\w+\\.(com|org|net|cn|gov)";
        Pattern mailPattern = Pattern.compile(mailRegex);
        Matcher matcher = null;
        for (String mail: strings) {
            if (matcher == null) {
                matcher = mailPattern.matcher(mail);
            } else {
                matcher.reset(mail);
            }
            String result = mail + (matcher.matches() ? "是":"不是") + "有效的邮箱地址";
            System.out.println(result);
        }

    }
}
