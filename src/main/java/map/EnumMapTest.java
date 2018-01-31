package map;

import java.util.EnumMap;
import java.util.Set;

/**
 * EnumMap是一个与枚举类一同使用的Map实现，
 * 创建时必须指定它对应的枚举类，
 * key不允许为空，value可以为空
 *
 * @author: Hussein Chen.
 * Data: 2018/2/1
 * Time: 0:35
 * E-mail: 43138199@qq.com
 */
public class EnumMapTest {
    enum Season {
        SPRING, SUMMER, FALL, WINTER;
    }

    public static void main(String[] args) {
        EnumMap em = new EnumMap(Season.class);
        em.put(Season.WINTER, "银玥");
        em.put(Season.SPRING, "廖银玥");
        System.out.println(em);

        /*EnumMap通过Enum中枚举的定义顺序来维护其中的元素顺序*/
        Set keySet = em.keySet();
        for (Object key : keySet) {
            System.out.println(em.get((Season)key));
        }
    }
}
