package map;

import java.util.IdentityHashMap;

/**
 * IdentityHashMap是HashMap的一个特殊实现
 * HashMap中只要key1和key2使用equals返回true和hashcode返回的值相等即判断key相等
 * 而IdentityHashMap则当且仅当key1=key2的时候才判断key相等
 *
 * @author: Hussein Chen.
 * Data: 2018/2/1
 * Time: 0:06
 * E-mail: 43138199@qq.com
 */
public class IdentityHashMapTest {
    public static void main(String[] args) {
        IdentityHashMap ihm = new IdentityHashMap();
        /*如下，两个老婆由于都是新创建的字符串指向不同的变量，
        * 故ihm认为key不相等*/
        ihm.put(new String("老婆"), "廖银玥");
        ihm.put(new String("老婆"), "银玥");

        /*而由于字符串直接量是常量池管理的，
        * 所以指向的是同一个常量，故ihm认为key1=key2，
        * 所以第二个女票覆盖了第一个女票的value*/
        ihm.put("女票", "玥玥");
        ihm.put("女票", "玥");

        System.out.println(ihm);
    }
}
