package set_test;

import java.util.Date;
import java.util.TreeSet;

/**
 * 大部分类在实现compareTo方法的时候都会强制将被比较对象强转为何比较对象相同的类型后来比较
 * 只有相同的类才会比较大小，如果加入treeSet集合中的元素类型不相同也会报ClassCastException异常
 *
 * @author: Hussein Chen.
 * Data: 2017/12/29
 * Time: 0:22
 * E-mail: 43138199@qq.com
 */
public class TreeSetTest3 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();

        treeSet.add("侯松辰最帅");
        treeSet.add(new Date());
    }
}
