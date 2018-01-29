package set_test;

import java.util.TreeSet;

/**
 * @author: Hussein Chen.
 * Data: 2017/12/29
 * Time: 0:54
 * E-mail: 43138199@qq.com
 */
public class TreeSetTest5 {
    static class R implements Comparable {
        int count;

        public R (int count) {
            this.count = count;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == R.class) {
                R r = (R)obj;
                return this.count == r.count;
            }
            return false;
        }

        @Override
        public int compareTo(Object o) {
            R r = (R)o;
            return this.count > r.count ? 1 : this.count < r.count ? -1 : 0;
        }

        @Override
        public String toString() {
            return "R[count:" + this.count + "]";
        }
    }

    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new R(-3));
        treeSet.add(new R(5));
        treeSet.add(new R(9));
        treeSet.add(new R(-2));

        /*可以看到输出后的结果为有序的*/
        System.out.println(treeSet);

        /*修改第一个元素的值为20，最后一个元素的值为-2*/
        R r = (R)treeSet.first();
        r.count = 20;
        R r2 = (R)treeSet.last();
        r2.count = -2;

        /*输出的结果中存在重复的元素，且元素的顺序也并没有根据修改后的值再排序*/
        System.out.println(treeSet);

        /*删除失败
        * 由于重写的compareTo方法是count的值比较的
        * 对集合中的所有元素调用compareTo方法发现有两个返回值为1的对象
        * 所以编译器无法确定想要移除的是哪个元素*/
        System.out.println(treeSet.remove(new R(-2)));
        System.out.println(treeSet);

        /*删除成功
        * 调用compareTo方法只有一个元素返回1
        * 所以成功删除了该元素*/
        System.out.println(treeSet.remove(new R(5)));
        System.out.println(treeSet);

        /*删除失败
        * just my opinion：本来集合中的一个元素指向的是值为-3的对象
        * 后来该对象值变了但是位置却没有变，
        * TODO*/
        System.out.println(treeSet.remove(new R(20)));
    }
}
