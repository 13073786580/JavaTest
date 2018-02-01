package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 可操作集合的Collections工具类
 *
 * @author: Hussein Chen.
 * Data: 2018/2/1
 * Time: 23:32
 * E-mail: 43138199@qq.com
 */
public class CollectionsTest1 {
    public static void main(String[] args) {
        ArrayList nums = new ArrayList();
        nums.add(3);
        nums.add(5);
        nums.add(0);
        nums.add(-4);

        System.out.println(nums);

        /*反转集合中元素顺序*/
        Collections.reverse(nums);
        System.out.println(nums);
        /*对集合中元素进行随机排序，每次执行都会重新排序*/
        Collections.shuffle(nums);
        System.out.println(nums);
        /*对集合中的元素进行自然排序*/
        Collections.sort(nums);
        System.out.println(nums);
        /*若传入正数，则将下标为pram2（包含）后的元素移到集合最前;
        * 若传入负数，则将前|pram2|个元素移到数组最后*/
        Collections.rotate(nums, 2);
        System.out.println(nums);
        Collections.rotate(nums, -1);
        System.out.println(nums);


    }
}
