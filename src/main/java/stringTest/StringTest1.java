package stringTest;

import java.io.UnsupportedEncodingException;

/**
 * Author：Edison Hou.
 * Date：2017/6/15 21:18
 * phone:17621373690
 */
public class StringTest1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = new byte[1024];
        /*我们一般情况用的是改方法，其实我们创建的s1是参数original的副本*/
        String s1 = new String("String original为参数的构造器");
        /*将byte数组以指定字符集格式解码成String对象*/
        String s2 = new String(bytes,"UTF-8");
        /*将指定byte数组从0开始，长度为5的子数组解码成一个新的String对象*/
        String s3 = new String(bytes,0,5);

        /*charAt获取字符串指定位置的字符，起始位置为0，最末为length()-1*/
        System.out.println(s1.charAt(1));

        /*compareTo()比较两个字符串的大小，如果两个字符串长度大小相等则返回不相同的字符差，
        * 注意：是字符之间编码的差
        * 如果其中一个字符串是另一个字符串的子字符串，则返回两个字符串的长度差*/
        String s4 = new String("ggggzgg");
        String s5 = new String("gggg");
        String s6 = new String("ggggggg");
        System.out.println(s4.compareTo(s6));
        System.out.println(s5.compareTo(s6));

        /*将参数接在调用字符串的后面，相当于字符串直接量之间的 “+” */
        System.out.println(s1.concat(s6));

        /*比较字符串对象和StringBuffer字符串对象，相同返回true，不同反之*/
        StringBuffer buffer = new StringBuffer("gggg");
        System.out.println(s5.contentEquals(buffer));

        /*String的类方法，copyValueOf，将字符数组连接成字符串*/
        char[] chars = {'w','s','n','d'};
        System.out.println(String.copyValueOf(chars));

        /*String类方法，将指定字符数组从其实位置offset，长度为count的字符连接为字符串*/
        System.out.println(String.copyValueOf(chars,0,2));

        /*判断字符串对象是否是以参数为结尾的*/
        String s7 = new String("wqnmlgb");
        System.out.println(s7.endsWith("gb"));

        /*判断该字符串对象和指定字符串对象的字符序列是否相等*/
        String s8 = new String("wqnmlgb");
        System.out.println(s7.equals(s8));

        /*判断字符序列是否相同，忽略大小写*/
        String s9 = new String("WQNMLGB");
        System.out.println(s8.equalsIgnoreCase(s9));

        /*将字符串对象以置顶字符集格式解码为byte数组*/
        System.out.println(s9.getBytes("UTF-8"));

        /*将字符串对象从0位置开始，到4位置结束（含头不含尾）的字符复制到指定的char数组从1开始的位置*/
        char[] chars1 = new char[5];
        s9.getChars(0,4,chars1,1);
        for (int i = 0; i < chars1.length; i++) {
            System.out.println(chars1[i]);
        }

        /*indexOf,查找指定字符或字符串第X次出现的位置，不给次数参数默认为第一次，
        * 还有反向的lastIndexOf方法，是从后面开始计算是第X次的，
        * 但是字符的下标位置还是从前算的*/
        String s10 = new String("hahahagg");
        System.out.println("start:" + s10.indexOf('a'));
        System.out.println(s10.indexOf('a',2));
        System.out.println(s10.indexOf("ha"));
        System.out.println(s10.indexOf("ha",2) + ":end");
        System.out.println(s10.lastIndexOf("ha",1));

        /*length()方法，返回字符串的长度*/
        System.out.println(s10.length());

        /*将字符串中第一次出现的老字符替换为新字符*/
        System.out.println(s10.replace("gg","GG"));

        /*判断该字符串是否以指定的字符开始，加上位置参数为从该位置开始
            是否是以指定字符开始*/
        System.out.println(s10.startsWith("ha"));
        System.out.println(s10.startsWith("ha",1));

        /*获取从指定位置后的字符串*/
        System.out.println(s10.substring(4));

        /*获取从指定起始位置到指定结束位置之间的字符串，含头不含尾
        * 如起始2和结束4，返回的是下标为2和3的子字符串*/
        System.out.println(s10.substring(2,4));

        /*toCharArray()将字符串转化为char数组*/
        char[] chars2 = s10.toCharArray();
        for (int i = 0; i < chars2.length; i++) {
            System.out.print(chars2[i] + ",");
        }

        /*toLowerCase()将字符串全部转化为小写
        * toUpperCase()将字符串全部转化为大写*/
        String s11 = new String("WhosYourDaddy");
        System.out.println("\n" + s11.toLowerCase());
        System.out.println(s11.toUpperCase());

        /*还有一系列的String的类方法，用来将其他类型转换为字符串的方法
        * 在此不再啰嗦了*/
        String s12 = String.valueOf(1);

        /*将数据s13字符串以GBK编码解析为byte数组，并以utf-8的编码解析为字符串*/
        String s13 = new String("嘿嘿");
        String s14 = new String(s13.getBytes("GBK"), "utf-8");

    }
}
