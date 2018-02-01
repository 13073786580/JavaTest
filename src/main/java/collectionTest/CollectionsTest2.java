package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author: Hussein Chen.
 * Data: 2018/2/2
 * Time: 0:13
 * E-mail: 43138199@qq.com
 */
public class CollectionsTest2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(-5);
        nums.add(4);
        nums.add(0);
        nums.add(0);

        System.out.println(nums);

        /*输出集合中最大值元素*/
        System.out.println(Collections.max(nums));
        /*输出集合中最小值元素*/
        System.out.println(Collections.min(nums));
        /*输出集合中指定元素param2出现的次数*/
        System.out.println(Collections.frequency(nums, 0));

        /*输出子集合在指定集合中出现的位置的下标，若不存在指定子集合则返回-1*/
        ArrayList subList = new ArrayList<Integer>();
        subList.add(0);
        subList.add(0);
        System.out.println(Collections.indexOfSubList(nums, subList));

        /*返回以二分法搜索指定元素在集合中出现的位置的下标*/
        System.out.println(Collections.binarySearch(nums, 2));

        /*将集合中的值为param1的元素的值全部替换为param2的值*/
        Collections.replaceAll(nums, 0, 6);
        System.out.println(nums);

        /*将集合中的所有元素替换为param2的值*/
        Collections.fill(nums, 8);
        System.out.println(nums);
    }
}
