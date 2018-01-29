package map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Hussein Chen.
 * Data: 2018/1/21
 * Time: 23:50
 * E-mail: 43138199@qq.com
 */
public class MapTest {
    public static void main(String[] args) {
        Map map = new HashMap(16);
        map.put("东野圭吾", "白夜行");
        map.put("安东尼", "所有我们看不见的光");
        map.put("当年明月", "明朝那些事儿");
        map.put("余华", "活着");

        /*当向map中放入重复的key时，新的value会覆盖原有的value
        * 并返回被覆盖的value*/
        System.out.println(map.put("东野圭吾", "嫌疑人X的献身"));

        System.out.println(map);

        System.out.println(map.containsKey("余华"));

        System.out.println(map.containsValue("白夜行"));

        /*获得map中key值得集合set
        * 再遍历获得key对应的值*/
        for (Object key : map.keySet()) {
            System.out.println(key + "=====" +map.get((String)key));
        }

        System.out.println(map.remove("安东尼"));

        System.out.println(map);
    }
}
