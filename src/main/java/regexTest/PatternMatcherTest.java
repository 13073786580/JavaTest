package regexTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Matcher的用途之一：网络爬虫
 * 利用正则表达式去匹配对方传递的报文或者是网页上的内容
 * 在本例中，我们模拟了一下获取内容中的电话号码
 *
 * Author Edison Hou.
 * Date: 2017/7/11,
 * Time: 23:20,
 * phone:17621373690
 */
public class PatternMatcherTest {
    private static Pattern pattern = Pattern.compile("((13\\d)|(17\\d)|(18\\d))\\d{8}");
    private static Pattern pattern2 = Pattern.compile("\\w+");

    public static void main(String[] args) {
        String s = "哈哈哈哈，我的电话是17621373690，他的电话是13073786580，她的电话是18317181294";
        /*importent！
        * 在利用Pattern编译一个正则表达式的时候，
        * 不需要添加表示正则表达式开始和结尾的字符*/
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        /*输出每个子串的起始位置和结束位置*/
        String s1 = "java is the best program language";
        Matcher matcher1 = pattern2.matcher(s1);
        while (matcher1.find()) {
            System.out.println(matcher1.group()+"子串的起始位置：" + matcher1.start() + "，其结束位置：" + matcher1.end());
        }
    }
}
