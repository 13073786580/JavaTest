package list_test;


import java.util.ArrayList;
import java.util.List;

/**
 * @author: Hussein Chen.
 * Data: 2018/1/17
 * Time: 0:14
 * E-mail: 43138199@qq.com
 */
public class ListTest1 {
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add(new String("白夜行"));
        books.add(new String("所有我们看不见的光"));
        books.add(new String("明朝那些事儿"));
        System.out.println(books);

        books.add(1, new String("人间失格"));
        System.out.println(books);

        System.out.println(books.indexOf(new String("白夜行")));

        books.remove(2);
        System.out.println(books);

        /**
         * List判断两个对象相等的条件是equals方法返回true即可
         */
        books.set(1, new String("影响力"));
        System.out.println(books);

        /**
         * subList方法返回对应索引之间的元素
         * 含头不含尾
         */
        System.out.println(books.subList(1, 2));
    }
}
