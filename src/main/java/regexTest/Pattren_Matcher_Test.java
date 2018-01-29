package regexTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * java提供的在程序中使用正则表达式的类，
 * Pattern是正则表达式编译后在内存中的表示形式，必须先编译为Pattern对象
 * Matcher负责执行匹配并保留执行匹配后的状态
 * 多个Matcher对象可共用一个Pattern对象
 *
 * Author Edison Hou.
 * Date: 2017/7/11,
 * Time: 22:39,
 * phone:17621373690
 */
public class Pattren_Matcher_Test {
    private static Pattern pattern = Pattern.compile("^a*b$");
    public static void main(String[] args) {
        /*一个Pattern对象可以多次使用*/
        Matcher matcher = pattern.matcher("aaab");
        Matcher matcher1 = pattern.matcher("b");
        boolean b = matcher.matches();
        boolean b1 = matcher1.matches();
        System.out.println(b);
        System.out.println(b1);

        /*我们也可以直接使用Pattern的类方法来执行匹配正则表达式，
        * 这种方法唯一的缺陷是一个正则表达式只能使用一次，不能重复使用
        * 每次都会重新编译一个新的Pattern对象去执行匹配，
        * 影响系统性能，
        * 好处在于节省了代码行数*/
        boolean b2 = Pattern.matches("^a*b$", "aaaaaab");
        System.out.println("Pattern的类方法：" + b2);

        Matcher matcher2 = pattern.matcher("aab");
        boolean b3 = matcher2.find();
        System.out.println("返回目标字符串中是否包含于Pattern匹配的子串：" + b3);

        String s = matcher2.group();
        System.out.println("返回上一个于Pattern匹配的子串：" + s);

        int i = matcher2.start();
        System.out.println("返回上一个与Pattern匹配的子串在目标字符串中的位置：" + i);
    }
}
