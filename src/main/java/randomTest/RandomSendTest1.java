package randomTest;

import java.util.Random;

/**
 * Author：Edison Hou.
 * Date：2017/6/22 22:19
 * phone:17621373690
 */
public class RandomSendTest1 {
    public static void main(String[] args) {
        /*首先需要说明的是，我们通过random类生成的都是伪随机数，
        * 并不是真正的随机数。因为random是通过算法和种子来生成的随机数，
        * 我们只要知道其中的算法和种子就能知道他产生随机数的顺序，
        * 所以，如果要使用random来生成随机数，那么最好使用system.currentTimeMills()来作为种子，
        * 但是只要对方提前以那个时间数字来生成随机数，还是可以知道你产生随机数的顺序*/
        Random random1 = new Random(50);
        System.out.println(random1.nextFloat());
        System.out.println(random1.nextInt());
        System.out.println("--------------------------------");
        Random random2 = new Random(50);
        System.out.println(random2.nextFloat());
        System.out.println(random2.nextInt());
    }
}
