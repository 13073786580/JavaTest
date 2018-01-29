package collectionTest;

import java.util.Collection;
import java.util.HashSet;

/**
 * JAVA8为集合新增的方法，removeIf()，函数式接口
 * 可以传入一个函数，如Lambda表达式，过滤掉不符合条件的集合选项
 *
 * Author HouZ.
 * Date: 2017/9/29,
 * Time: 0:26
 */
public class PredicateTest {
    public static void main(String[] args) {
        Collection collection = new HashSet();
        collection.add("111");
        collection.add("222");
        collection.add("333");

        collection.removeIf(obj -> ((String)obj).contains("11"));

        System.out.println(collection);
    }
}
