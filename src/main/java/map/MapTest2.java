package map;

import java.util.HashMap;
import java.util.Map;

/**
 * 以下方法均为JDK1.8新增方法
 *
 * @author: Hussein Chen.
 * Data: 2018/1/22
 * Time: 23:50
 * E-mail: 43138199@qq.com
 */
public class MapTest2 {
    public static void main(String[] args) {
        Map map = new HashMap(16);
        map.put("白夜行", 69);
        map.put("活着", 89);
        map.put("三体", 388);
        map.put("哈哈", null);
        map.put("呵呵", null);

        /*在JDK1.8以前我们想要替换一个map的value值需要调用put方法，
        * 正确填写原有的key和新的value值才会发生替换的效果，
        * 可是这种方法有一个弊端在于，如果key值填错即map中不存在key为所填值得key-value对，
        * 则会在map中新增一个key-value对，
        * 而JDK1.8中新增的方法则会判断是否存在key为所填值key-value对，
        * 存在则拿新的value替换原value并返回原value值，不存在则不会新增key-value对并返回null*/
        System.out.println(map.replace("教父", 77));
        System.out.println(map);

        /*该方法先去根据key查找对应的value，如果获得的value为null则直接用param2替换原value
        * 并且如果key也不存在，则会新增一个key为param1值，value为param2的key-value对，
        * 如果获得的value值不为null，则通过param3的Lambda表达式用原value和param2计算后的值替换原value*/
        System.out.println(map.merge("三体", 100, (oldVal, param) -> (Integer)oldVal + (Integer)param));
        System.out.println(map);

        /*该方法判断key为所传值得value是否为null，
        * 若为null则用Lambda表达式计算后的值替换其value并返回新value，
        * 若不为null则不发生任何操作，
        * 若不存在key为所传值的key-value对则新增一个key-value对,
        * 若计算结果也为null则不发生变化*/
        System.out.println(map.computeIfAbsent("哈哈", (price) -> price = 189));
        System.out.println(map);

        /*该方法判断key为所传值得value是否为null，
        * 若不为null则用Lambda表达式计算后的值替换其value并返回新value，
        * 若为null则不发生任何操作，
        * 若不存在key为所传值的key-value对不发生任何操作,
        * 若计算结果也为null则删除该key-value对*/
        System.out.println(map.computeIfPresent("活着", (key, value) ->(Integer)value * 10 ));
        System.out.println(map);
    }
}
