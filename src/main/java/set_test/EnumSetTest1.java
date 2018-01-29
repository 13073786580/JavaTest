package set_test;

import java.util.EnumSet;

/**
 * EnumSet有一点和Set集合有所不同
 * Set集合是允许出现null值的，而EnumSet值则不允许出现null值
 * 如果试图插入null值，则会报出NullPointerException异常
 *
 * @author: Hussein Chen.
 * Data: 2018/1/4
 * Time: 23:41
 * E-mail: 43138199@qq.com
 */
public class EnumSetTest1 {
    enum Season {
        SPRING,SUMMER,FALL,WINTER
    }

    public static void main(String[] args) {
        /*将枚举类的所有值放入枚举集合*/
        EnumSet es1 = EnumSet.allOf(Season.class);
        System.out.println(es1);

        /*创建一个元素类型为该枚举类类型的空集合
        * 可以手动向集合中添加该枚举类中的值*/
        EnumSet es2 = EnumSet.noneOf(Season.class);
        System.out.println(es2);
        es2.add(Season.WINTER);
        es2.add(Season.SUMMER);
        System.out.println(es2);

        /*以指定的枚举值来创建一个枚举集合*/
        EnumSet es3 = EnumSet.of(Season.SPRING, Season.WINTER);
        System.out.println(es3);

        /*根据枚举类中的枚举顺序，来将从parm1到parm2的枚举值全部放入EnumSet*/
        EnumSet es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
        System.out.println(es4);

        /*创建一个原EnumSet不包含的，枚举类中剩下的值得EnumSet
        * 即，枚举类中的所有枚举值减去参数EnumSet中的值
        * 将剩下的值放入一个新的EnumSet*/
        EnumSet es5 = EnumSet.complementOf(es4);
        System.out.println(es5);

    }
}
