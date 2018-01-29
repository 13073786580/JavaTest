package set_test;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

/**
 * @author: Hussein Chen.
 * Data: 2018/1/5
 * Time: 0:00
 * E-mail: 43138199@qq.com
 */
public class EnumSetTest2 {
    enum Season {
        SPRING, SUMMER, FALL, WINTER
    }

    /**
     * 如果一个集合中的元素均为一个枚举类中的枚举值
     * 则可以使用EnumSet中的方法copyOf()来将集合中的值复制给EnumSet
     * 但若集合中有元素不为相同枚举类中的值
     * 则会报ClassCastException异常
     *
     * @param args
     */
    public static void main(String[] args) {
        Collection c = new HashSet();

        c.add(Season.SPRING);
        c.add(Season.WINTER);

        EnumSet es1 = EnumSet.copyOf(c);
        System.out.println(es1);

        c.add("侯松辰大帅逼");
        c.add("Hussein Chen");
        EnumSet es2 = EnumSet.copyOf(c);
        System.out.println(es2);
    }
}
