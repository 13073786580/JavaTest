package set_test;

import java.util.TreeSet;

/**
 * 执行如下程序会发生错误
 * 原因主要在于像treeSet中添加的元素没有实现Comparable接口
 * 当向treeSet中添加的时候会调用compareTo方法来排序
 * 由于对象没有实现Compareable接口所以会报ClassCastException异常
 *
 * 原则上向treeSet中添加的元素都应该实现Comparable接口
 * 可是当添加第一个元素的时候，该元素可以不实现Comparable接口
 * 因为只有一个元素的时候无需排序，后面再添加的元素都需要实现Comparable接口
 *
 * 虽然第一个元素有这个漏洞存在，看似可以将没有实现Comparable接口的元素添加进去
 * 可是这个集合是无法使用的，一旦需要取出元素则依旧会报ClassCastException异常
 *
 * @author: Hussein Chen.
 * Data: 2017/12/29
 * Time: 0:13
 * E-mail: 43138199@qq.com
 */
public class TreeSetTest2 {
    private static class err{

    }

    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();

        treeSet.add(new err());
        treeSet.add(new err());
    }
}
