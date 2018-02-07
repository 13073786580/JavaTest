package collectionTest;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/**
 * Enumeration类就是古老的Iterater类，
 * 从JDK1.0开始存在的，由于其方法名太长不宜使用，
 * 所以就有了Iterator，无特殊情况通常使用Iterator，
 * Enumeration只能迭代古老的集合类如Vector，Hashtable
 *
 * @author: Hussein Chen.
 * Data: 2018/2/4
 * Time: 22:58
 * E-mail: 43138199@qq.com
 */
public class EnumerationTest {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("廖银玥");
        vector.add("玥玥");
        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        System.out.println("========================");
        Hashtable hashtable = new Hashtable();
        hashtable.put("老婆", "廖银玥");
        hashtable.put("媳妇", "银玥");
        Enumeration enumeration1 = hashtable.keys();
        while (enumeration1.hasMoreElements()) {
            System.out.println(enumeration1.nextElement());
        }

        System.out.println("========================");
        Enumeration enumeration2 = hashtable.elements();
        while (enumeration2.hasMoreElements()) {
            System.out.println(enumeration2.nextElement());
        }
    }
}
