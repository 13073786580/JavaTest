package collectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 传统集合在存储对象的时候，没有设置泛型
 * 系统将所有的集合泛型都理解为Object类型的
 *
 * Author HouZ.
 * Date: 2017/8/28,
 * Time: 23:40
 */
public class CollectionTest1 {
    public static void main(String[] args) {
        //创建一个空的集合
        Collection c = new ArrayList();
        String s1 = "HouZ";
        c.add(s1);
        /*众所周知，集合存储的是对象（准确来说是对象的引用变量）,
        * 是不能存储基本类型的变量的，但是JAVA支持自动装箱，
        * 所以这里存储的应该是Integer类型的变量，
        * 而由于上方我们并没有指定其泛型，
        * 所以String、Integer等类型是都可以存储在一个集合中的*/
        c.add(6);

        c.remove(6);

        System.out.println("数组的长度为：" + c.size());

        System.out.println("是否包含HouZ字符串对象：" + c.contains("HouZ"));

        c.add("猴子");
        /*直接输出集合c，结果为c所包含的所有元素
        * 集合类重写了toString方法，输出集合中的所有元素*/
        System.out.println(c);

        Collection c2 = new HashSet();
        c2.add("HouZ");
        c2.add("hsc");
        c2.add("猴子");

        System.out.println("c2集合是否包含c集合：" + c2.containsAll(c));

        /*removeAll方法可以理解为，集合1减去集合2*/
        c2.removeAll(c);
        System.out.println(c2);

        /*判断集合1和集合2的交集*/
        System.out.println(c2.retainAll(c));

        /*清空集合中的所有元素*/
        c2.clear();
        System.out.println(c2);

    }
}
