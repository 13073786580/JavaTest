package list_test;

import java.util.Arrays;
import java.util.List;

/**
 * 这里将要介绍的不是我们通常使用的实现了List接口的ArrayList
 * 而是通过Arrays工具类创建的集合类
 *
 * @author: Hussein Chen.
 * Data: 2018/1/17
 * Time: 23:48
 * E-mail: 43138199@qq.com
 */
public class ArrayListTest1 {
    /**
     * 通过Arrays工具类创建的集合其实是Arrays类中封装的内部类ArraysList的对象
     * 该集合是固定长度的，即不可新增，不可删除其中的元素
     * @param args
     */
    public static void main(String[] args) {
        List fixedList = Arrays.asList(
                "白夜行", "人间失格"
        );

        System.out.println(fixedList.getClass());

        fixedList.forEach(System.out::println);

        /*虽然不可新增或删除集合中的元素，
        * 但是可以修改其中的元素的内容*/
        fixedList.set(1, "明朝那些事儿");
        System.out.println(fixedList);

        /*如果新增或删除元素都会报UnsupportedOperationException异常*/
        fixedList.add("三体");
        fixedList.remove("白夜行");
    }
}
