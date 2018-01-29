package set_test;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Set当中，HashSet、TreeSet和EnumSet都是线程不安全的
 * 如果有多个线程要使用它，则需要通过方法来创建他的线程安全的Set
 *
 * @author: Hussein Chen.
 * Data: 2018/1/16
 * Time: 23:56
 * E-mail: 43138199@qq.com
 */
public class SynchronizeedSortedSet {
    public static void main(String[] args) {
        SortedSet ss = Collections.synchronizedSortedSet(new TreeSet<>());
    }
}
