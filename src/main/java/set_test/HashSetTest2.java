package set_test;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author: Hussein Chen.
 * Data: 2017/12/26
 * Time: 23:24
 * E-mail: 43138199@qq.com
 */
public class HashSetTest2 {
    private static class R {
        int count;

        public R (int count) {
            this.count = count;
        }

        @Override
        public String toString() {
            return "R[count:" + count + "]";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == R.class) {
                R r = (R)obj;
                return this.count ==  r.count;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.count;
        }
    }

    /**
     * 可以看到，我们修改了第一个元素的值，使其与第二个元素相同
     * 这时，删除掉属性为-3的元素，最后判断我们即不存在值为-3的元素也不存在值为-2的元素
     *
     * 原因：当我们把元素放入set集合的时候，其在内存中的位置就已经确定了
     * 虽然修改了第一个元素的属性和第二个元素的属性相同
     * 但是删除的时候，set会通过元素hashCode方法的返回值定位元素，也就是删除了第二个元素
     * 第一个元素的属性虽然也为-3，但是其在内存中的位置却是放在属性为-2的元素的位置
     * 但使用equals方法和-2的R相比较却返回false
     *
     * 所以，这时候的第一个元素，虽然遍历的时候还可以看到
     * 但是已经没有办法再访问到了
     * @param args
     */
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new R(-2));
        set.add(new R(5));
        set.add(new R(-3));
        set.add(new R(9));

        System.out.println(set);

        //将第一个元素的值设为-3，与第二个元素相同
        Iterator iterator = set.iterator();
        R first = (R) iterator.next();
        first.count = -3;
        System.out.println(set);

        //删除值为-3的元素
        set.remove(new R(-3));
        System.out.println(set);

        //判断是否存在值为-3的元素
        System.out.println(set.contains(new R(-3)));

        //判断是否存在值为-2的元素
        System.out.println(set.contains(new R(-2)));
    }
}
