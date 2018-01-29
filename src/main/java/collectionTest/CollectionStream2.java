package collectionTest;

import java.util.Collection;
import java.util.HashSet;

/**
 * Author: HouZ,
 * Data: 2017/10/9,
 * Time: 23:56
 */
public class CollectionStream2 {
    public static void main(String[] args) {
        /*创建集合并添加元素*/
        Collection books = new HashSet<>();
        books.add("轻量级JAVA");
        books.add("疯狂JAVA");
        books.add("疯狂Android");
        books.add("疯狂IOS");
        books.add("疯狂HTML");

        System.out.println(books.stream().filter(ele -> ((String)ele).contains("疯狂")).count());
        System.out.println(books.stream().filter(ele -> ((String)ele).contains("JAVA")).count());
        System.out.println(books.stream().filter(ele -> ((String)ele).length() > 6).count());

        /*先调用集合对象的stream()方法获取其对应的stream
        * 再调用mapToInt()方法获取其对应的IntStream流
        * 下面的mapToInt方法就是上回说到的中间方法，
        * 所以下面才可以继续调用forEach方法*/
        books.stream().mapToInt(ele -> ((String)ele).length())
                .forEach(System.out::println);
    }
}
