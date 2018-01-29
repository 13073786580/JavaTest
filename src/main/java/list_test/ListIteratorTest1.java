package list_test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * list对象有一个专属的迭代器ListIterator
 * Java8中为ListIterator新增了几种方法
 *
 * 1.hasPrevious()：返回迭代器关联的集合是否还有上一个元素（普通Iterator只含有向后迭代方法）
 * 2.add()：在指定位置插入一个元素（普通Iterator只含有删除元素的方法）
 * 3.previous()：返回该迭代器的上一个元素
 *
 * @author: Hussein Chen.
 * Data: 2018/1/17
 * Time: 0:49
 * E-mail: 43138199@qq.com
 */
public class ListIteratorTest1 {
    public static void main(String[] args) {
        String[] books = {
                "白夜行", "明朝那些事儿", "人间失格"
        };
        List booksList = new ArrayList();

        for (int i = 0; i < books.length; i++) {
            booksList.add(books[i]);
        }

        ListIterator li = booksList.listIterator();
        int index = 0;
        System.out.println("=======正向迭代=======");
        while (li.hasNext()) {
            System.out.println(li.next());
            li.add(index++);
        }

        System.out.println("=======反向迭代========");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}
