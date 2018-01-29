package set_test;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet和HashSet的主要区别在于前者是有序的
 *
 * 1.因为需要维护元素的顺序所以插入较后者慢
 * 2.因为是有序的所以迭代集合的时候会较后者快
 * 3.始终都是set所以不能存在元素重复
 *
 * @author: Hussein Chen.
 * Data: 2017/12/26
 * Time: 23:47
 * E-mail: 43138199@qq.com
 */
public class LinkedHashSetTest1 {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("111");
        linkedHashSet.add("222");
        System.out.println(linkedHashSet);

        linkedHashSet.remove("111");
        linkedHashSet.add("111");
        System.out.println(linkedHashSet);
    }
}
