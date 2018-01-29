package collectionTest;

import java.util.Collection;
import java.util.HashSet;

/**
 * Java8新增的Iterable接口中新增了一个抽象方法forEach，
 * 调用forEach时将调用Consumer的accept方法，来遍历集合
 * 因此Consumer为函数式接口，所以可以使用lambda表达式
 *
 * Author HouZ.
 * Date: 2017/9/28,
 * Time: 22:43
 */
public class LambdaIterableTest {
    public static void main(String[] args) {
        Collection collections = new HashSet();
        collections.add("111");
        collections.add("222");
        collections.add("333");

        /*这样理解可以方便点，这是一个匿名内部类，
        * 传入的是Consumer对象，并且需要我们去实现accept抽象方法，
        * 而lambda表达式即该方法的实现
        * object代表我们集合中的当前对象*/
        collections.forEach(obj -> System.out.println(obj));
    }
}
