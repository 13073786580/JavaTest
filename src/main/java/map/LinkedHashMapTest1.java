package map;

import java.util.LinkedHashMap;

/**
 * LinkedHashMap按元素插入的顺序来维护
 * 其迭代顺序
 *
 * @author: Hussein Chen.
 * Data: 2018/1/25
 * Time: 23:40
 * E-mail: 43138199@qq.com
 */
public class LinkedHashMapTest1 {
    public static void main(String[] args) {
        LinkedHashMap prices = new LinkedHashMap();
        prices.put("白夜行", 233);
        prices.put("嫌疑人x的献身", 666);
        prices.put("解忧杂货店", 555);

        prices.forEach((key, value) -> System.out.println(key + "=====" + (Integer)value*2));
    }
}
