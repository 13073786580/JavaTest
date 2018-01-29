package collectionTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Author HouZ.
 * Date: 2017/9/29,
 * Time: 0:03
 */
public class ForEachTest {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("houzi");
        stringList.add("hou");
        stringList.add("hsc");

        /*foreach操作的并不是集合中的变量本身，
        * 而是将集合中的变量逐个赋值给另一个变量来遍历的，
        * 所以对所谓“集合变量”的修改并不影响集合中变量的值*/
        for (String str : stringList ) {
            str = "111";
            System.out.println(str);
        }

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
    }
}
