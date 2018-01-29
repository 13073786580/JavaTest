package list_test;

import java.util.ArrayList;
import java.util.List;

/**
 * sort方法根据传入的Comparator对象排序
 * replace方法根据传入的Comparator对象替换集合中的每个元素
 *
 * @author: Hussein Chen.
 * Data: 2018/1/17
 * Time: 0:39
 * E-mail: 43138199@qq.com
 */
public class ListTest3 {
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add("白夜行");
        books.add("明朝那些事儿");
        books.add("人间失格");
        System.out.println(books);

        books.sort((o1, o2) -> ((String)o1).length() - ((String)o2).length());
        System.out.println(books);

        books.replaceAll(ele -> ((String)ele).length());
        System.out.println(books);
    }
}
