package set_test;

import java.util.HashSet;

/**
 * 1.HashSet非线程同步
 * 2.HashSet不保证元素的顺序，顺序可能会发生变化
 * 3.HashSet允许出现null值
 *
 * Tips：HashSet通过元素的HashCode值来决定元素的存放位置
 *
 * @author: Hussein Chen.
 * Data: 2017/12/24
 * Time: 23:10
 * E-mail: 43138199@qq.com
 */
public class HashSetTest1 {
    private static class A {
        @Override
        public boolean equals(Object obj) {
            return true;
        }
    }

    private static class B {
        @Override
        public int hashCode() {
            return 1;
        }
    }

    private static class C {
        @Override
        public boolean equals(Object obj) {
            return true;
        }

        @Override
        public int hashCode() {
            return 2;
        }
    }

    /**
     * HashSet不允许存在相同的值
     * HashSet判断值相同的方法是既比较equals又比较hashcode的值
     * 只有两个方法的返回值都不相同的情况下才会判断该对象是相同的
     * @param args
     */
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        hashSet.add(new A());
        hashSet.add(new A());

        hashSet.add(new B());
        hashSet.add(new B());

        hashSet.add(new C());
        hashSet.add(new C());

        hashSet.forEach(ele -> System.out.println(ele));
        System.out.println(hashSet);

    }
}

