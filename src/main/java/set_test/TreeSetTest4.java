package set_test;

import java.util.TreeSet;

/**
 * @author: Hussein Chen.
 * Data: 2017/12/29
 * Time: 0:38
 * E-mail: 43138199@qq.com
 */
public class TreeSetTest4 {
    static class Z implements Comparable {
        int age;

        public Z (int age) {
            this.age = age;
        }

        @Override
        public boolean equals(Object obj) {
            return true;
        }

        @Override
        public int compareTo(Object o) {
            return 1;
        }
    }

    /**
     * 由于我们重写了Z类的compareTo方法使其只返回1
     * 所以当向treeSet集合中添加元素的时候
     * 虽然添加的是同一个对象可是依然可以添加进去
     * 由于集合中存放的都是对象的引用
     * 所以我们修改了第一个元素的值
     * 可是最后一个元素的值也被修改了
     * 因为他们都是指向了相同的对象
     * @param args
     */
    public static void main(String[] args) {
        Z z = new Z(5);
        TreeSet treeSet = new TreeSet();

        treeSet.add(z);

        System.out.println(treeSet.add(z));

        System.out.println(treeSet);

        ((Z)treeSet.first()).age = 9;

        System.out.println(((Z)treeSet.last()).age);
    }
}
