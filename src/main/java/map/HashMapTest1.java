package map;

import java.util.HashMap;

/**
 * 虽然HashMap允许key或value为null，
 * 但是只能有一个key-value的key为null，
 * 可以有多个key不同value为null的情况
 *
 * @author: Hussein Chen.
 * Data: 2018/1/24
 * Time: 23:26
 * E-mail: 43138199@qq.com
 */
public class HashMapTest1 {
    public static void main(String[] args) {
        HashMap hm = new HashMap(16);
        hm.put(null, null);
        hm.put(null, null);
        System.out.println(hm);
        hm.put("a", null);
        System.out.println(hm);


    }
}
