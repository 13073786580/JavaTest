package randomTest;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Author：Edison Hou.
 * Date：2017/6/22 22:27
 * phone:17621373690
 */
public class ThreadLocalRandomTest1 {
    public static void main(String[] args) {
        /*ThreadLocalRandom类和Random类的用法基本一样，
        * 只是前者是线程安全的，减少了多线程对于资源的抢占，
        * 还有一点功能在于他可以指定在起始值N到结束值M之间产生随机数，
        * Random类并没有这个方法，都是默认从0开始的*/
        ThreadLocalRandom localRandom = ThreadLocalRandom.current();
        System.out.println(localRandom.nextInt(1,8));
    }
}
