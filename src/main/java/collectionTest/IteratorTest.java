package collectionTest;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Iterator迭代器，用于遍历集合
 *
 * Author HouZ.
 * Date: 2017/9/28,
 * Time: 23:03
 */
public class IteratorTest {
    public static void main(String[] args) {
        Collection collections = new HashSet();
        collections.add("1111");
        collections.add("2222");
        collections.add("3333");

        Iterator iterator = collections.iterator();
        String temp = null;

        //正常迭代方法
        while (iterator.hasNext()) {
            temp = (String) iterator.next();
            iterator.remove();
            System.out.println(temp);
        }

        /*错误示范：在使用迭代器遍历集合时，
        * 禁止在遍历过程中对集合进行修改，否则会引发异常
        *
        * 我们会发现一点，程序运行中并没有输出2222，
        * 原因是，iterator采用的是快速失败机制，
        * 一旦发现集合已被修改就立即报异常，而不是显示修改后的结果*/
        /*while (iterator.hasNext()) {
            System.out.println(iterator.next());
            if ("2222".equals(iterator.next())) {
                collections.remove("3333");
            }
        }*/

        System.out.println(collections.size());
    }
}
