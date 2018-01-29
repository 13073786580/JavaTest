package regexTest;

/**
 * Author：Edison Hou.
 * Date：2017/7/3 22:46
 * phone:17621373690
 */
public class RegexTest1 {
    public static void main(String[] args) {
        String regex = "^(2|3){2}";
        String a1 = "22";
        String a2 = "23";
        String a3 = "33";
        String a4 = "222";
        String a5 = "2";
        System.out.println(a1.matches(regex));
        System.out.println(a2.matches(regex));
        System.out.println(a3.matches(regex));
        System.out.println(a4.matches(regex));
        System.out.println(a5.matches(regex));
        System.out.println("--------------------------");
        /*验证QQ邮箱的正则表达式
        * 代表前面0-9这九个数字字符至少要出现6次，至多出现11次，后面的子串@qq.com只能出现1次*/
        String regex2 = "^(0|1|2|3|4|5|6|7|8|9){6,11}(@qq.com){1}$";
        String qqEmail = "43138199@qq.com";
        String qqEmail2 = "a122121212@qq.com";
        String qqEmail3 = "12345@qq.com";
        String qqEmail4 = "0123456789012@qq.com";
        String qqEmail5 = "43138199@qq.com1";
        System.out.println(qqEmail.matches(regex2));
        System.out.println(qqEmail2.matches(regex2));
        System.out.println(qqEmail3.matches(regex2));
        System.out.println(qqEmail4.matches(regex2));
        System.out.println(qqEmail5.matches(regex2));
        /*验证QQ号？*/
        String regex3 = "^(0|1|2|3|4|5|6|7|8|9){6,11}$";
        String qqNum = "43138199";
        String qqNum2 = "375404951";
        String qqNum3 = "454673487";
        String qqNum4 = "43138199a";
        System.out.println("--------------------------");
        System.out.println(qqNum.matches(regex3));
        System.out.println(qqNum2.matches(regex3));
        System.out.println(qqNum3.matches(regex3));
        System.out.println(qqNum4.matches(regex3));

        String regex4 = "^(0|1|2)[abc]$";
        String str1 = "0a";
        String str2 = "0aa";
        System.out.println("----------------------------");
        System.out.println(str1.matches(regex4));
        System.out.println(str2.matches(regex4));

        /*[\\u4e00-\\u9fa5]为匹配中午汉字的正则表达式*/
        String regex5 = "^[\\u4e00-\\u9fa5]{1,3}$";
        String cnStr = "哈嘿呵";
        String cnStr2 = "";
        System.out.println("-----------------------------");
        System.out.println(cnStr.matches(regex5));
        System.out.println(cnStr2.matches(regex5));


    }
}
