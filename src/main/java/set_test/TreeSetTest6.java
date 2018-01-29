package set_test;

import java.util.TreeSet;

/**
 * @author: Hussein Chen.
 * Data: 2018/1/4
 * Time: 23:13
 * E-mail: 43138199@qq.com
 */
public class TreeSetTest6 {

    static class M {
        int age;

        public M (int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "M [age : " + this.age + "]";
        }
    }

    /**
     * 定制排序，自定义实现一个Comparator对象
     * 由于Comparator是一个函数式接口
     * 所以这里用Lambda表达式传入
     *
     * 返回-1的值排在集合顶部，返回1的值放在底部
     * 返回0的值则认为这两个对象相等，不放入集合中
     *
     * 由于定制排序不比较元素本身的大小而是通过自定义的Comparetor对象来比较
     * 所以集合中的元素类型不需要实现Camparable接口
     *
     * @param args
     */
    public static void main(String[] args) {
        TreeSet ts = new TreeSet((o1, o2) -> {
            M m1 = (M)o1;
            M m2 = (M)o2;

            return m1.age > m2.age ? -1 : m1.age < m2.age ? 1 : 0;
        });

        ts.add(new M(5));
        ts.add(new M(-9));
        ts.add(new M(3));
        System.out.println(ts);
    }
}
