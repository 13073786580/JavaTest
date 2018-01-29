package set_test;

import java.util.TreeSet;

/**
 * LinkedHashSet和TreeSet两者都会为集合中的元素排序
 * 区别在于，前者按插入顺序存储元素，也是按插入顺序排序的
 * 后者采用红黑树的数据结构存储元素，默认排序方法为自然排序
 *
 * @author: Hussein Chen.
 * Data: 2017/12/28
 * Time: 23:26
 * E-mail: 43138199@qq.com
 */
public class TreeSetTest1 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(-7);
        treeSet.add(9);

        /*输出treeSet会发现集合中的元素已经排好序*/
        System.out.println(treeSet);

        System.out.println(treeSet.first());

        System.out.println(treeSet.last());

        System.out.println(treeSet.headSet(4));

        /*返回大于或相等该元素的值得元素*/
        System.out.println(treeSet.tailSet(5));

        /*返回大于或等于parm1并且小于parm2的元素子集合*/
        System.out.println(treeSet.subSet(3,6));
    }
}
