package collectionTest;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

/**
 * Author HouZ.
 * Date: 2017/9/29,
 * Time: 0:48
 */
public class PredicateTest2 {
    public static void main(String[] args) {
        Collection collection = new HashSet();
        collection.add("Houzi");
        collection.add("houzi");
        collection.add("hsc");
        collection.add("hhh");

        System.out.println(getTotal(collection, obj -> ((String)obj).contains("ou")));
    }

    private static final int getTotal(Collection collection, Predicate predicate) {
        int total = 0;
        for (Object obj : collection) {
            /*predicate.test方法即判断是否符合传入的lambda表达式的值
            * 符合返回true，不符合返回false
            * */
            if (predicate.test(obj)) {
                total++;
            }
        }
        return total;
    }
}
