package collectionTest;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Author HouZ.
 * Date: 2017/9/28,
 * Time: 23:30
 */
public class IteratorLambdaTest {
    public static void main(String[] args) {
        Collection collection = new HashSet();
        collection.add("123");
        collection.add("234");
        collection.add("345");

        Iterator iterator = collection.iterator();

        iterator.forEachRemaining(obj -> System.out.println(obj));
    }
}
