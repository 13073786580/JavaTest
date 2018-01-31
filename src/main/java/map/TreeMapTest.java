package map;

import java.util.TreeMap;

/**
 * @author: Hussein Chen.
 * Data: 2018/1/31
 * Time: 0:03
 * E-mail: 43138199@qq.com
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put(new R(3), "廖银玥");
        tm.put(new R(9), "玥玥");
        tm.put(new R(-5), "银玥");
        tm.put(new R(5), "老婆");

        /*TreeMap即SortedMap接口的实现类，是可以维护元素顺序的map，
        默认使用自然排序即从小到大，根据key的大小调用compareTo方法进行排序，大的返回1放后面，小的返回-1放前面，相等返回0，
        也可以传入一个Comparater对象来改变其排序顺序*/
        System.out.println(tm);

        /*返回第一个键值对的value，没有直接返回value的方法*/
        System.out.println(tm.firstEntry().getValue());
        System.out.println(tm.firstKey());

        /*返回最后一个键值对的value*/
        System.out.println(tm.lastEntry().getValue());

        /*返回大于传入的参数值的最小的key*/
        System.out.println(tm.higherKey(new R(2)));

        /*返回小于传入的key值的最大的key值对应的键值对的value*/
        System.out.println(tm.lowerEntry(new R(8)).getValue());

        /*返回大于等于key1到小于key2的子map，即含头不含尾*/
        System.out.println(tm.subMap(new R(3), new R(9)));

        /*返回大于key1到小于key2的子map，
        其boolean变量代表着是否包含所传入的那个key值对应的键值对，
        如下所代表的即含尾不含头*/
        System.out.println(tm.subMap(new R(3), false, new R(9), true));
    }

    static class R implements Comparable{
        int count;

        public R (int count) {
            this.count = count;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == R.class) {
                R r = (R)obj;
                return r.count == this.count;
            }
            return false;
        }

        @Override
        public int compareTo(Object o) {
            R r = (R)o;
            return this.count > r.count ? 1 :this.count < r.count ? -1 : 0;
        }

        @Override
        public String toString() {
            return "R[count: " + this.count + "]";
        }
    }
}
