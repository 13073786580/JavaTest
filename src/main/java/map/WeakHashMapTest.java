package map;

import java.util.WeakHashMap;

/**
 * 弱引用HashMap，如果需要使用弱引用HashMap就不要使用强引用的key变量
 * 否则毫无意义
 *
 * @author: Hussein Chen.
 * Data: 2018/1/31
 * Time: 0:33
 * E-mail: 43138199@qq.com
 */
public class WeakHashMapTest {
    public static void main(String[] args) {
        WeakHashMap whm = new WeakHashMap();
        /*以下第一个和第二个为弱引用（匿名字符串），
        * 第三个为强引用*/
        whm.put(new String("女朋友"), "银玥");
        whm.put(new String("女票"), "玥玥");
        whm.put("老婆", "廖银玥");

        System.out.println(whm);

        /*通知系统立即进行垃圾回收*/
        System.gc();

        System.runFinalization();

        System.out.println(whm);
    }
}
