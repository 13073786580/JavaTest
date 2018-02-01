package collectionTest;

import java.util.*;

/**
 * Collections工具类可以将指定集合包装为线程同步的集合
 *
 * @author: Hussein Chen.
 * Data: 2018/2/2
 * Time: 0:35
 * E-mail: 43138199@qq.com
 */
public class CollectionsTest3 {
    public static void main(String[] args) {
        Collection c = Collections.synchronizedCollection(new ArrayList<>());
        List list = Collections.synchronizedList(new ArrayList<>());
        Set set = Collections.synchronizedSet(new HashSet<>());
        Map map = Collections.synchronizedMap(new HashMap<>());
    }
}
