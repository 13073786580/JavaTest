package list_test;



import java.util.ArrayList;
import java.util.List;

/**
 * List方法判断元素相等的条件是
 * equals方法返回true即可
 *
 * @author: Hussein Chen.
 * Data: 2018/1/17
 * Time: 0:25
 * E-mail: 43138199@qq.com
 */
public class ListTest2 {
    static class A {
        @Override
        public boolean equals(Object obj) {
            return true;
        }
    }

    /**
     * List判断集合中元素相等的条件是equals返回true即可
     * 我们创建了一个A对象，重写了其equals方法使其永远返回true
     * 所以当执行List的remove方法时，会按索引顺序依次与集合中的元素比较
     * 返回true即从集合中删除该元素
     *
     * 所以我们想要删除A对象，会依次删除list中的第一个元素
     * @param args
     */
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add(new String("白夜行"));
        books.add(new String("人间失格"));
        books.add(new String("解忧杂货店"));
        System.out.println(books);

        books.remove(new A());
        System.out.println(books);

        books.remove(new A());
        System.out.println(books);
    }
}
