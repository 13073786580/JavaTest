package randomTest;

import java.util.Arrays;
import java.util.Random;

/**
 * Author：Edison Hou.
 * Date：2017/6/22 21:28
 * phone:17621373690
 */
public class RandomTest1 {
    public static void main(String[] args) {
        Random random = new Random();
        /*随机生成true和false*/
        System.out.println(random.nextBoolean());
        /*这个随机生成的是什么，一个byte就是一个字节，一个字节等于8位（）8bit，1KB等于1024byte*/
        byte[] bytes = new byte[16];
        random.nextBytes(bytes);
        System.out.println(Arrays.toString(bytes));
        /*生成0.0-1.0之间的伪随机double数，double的范围大于float*/
        System.out.println(random.nextDouble());
        /*生成0.0-1.0之间的伪随机float数*/
        System.out.println(random.nextFloat());
        /*生成平均值是0.0，标准差是1.0的伪高斯数
        * PS：数学太烂的后果*/
        System.out.println(random.nextGaussian());
        /*生成位于int取值范围的伪随机数*/
        System.out.println("生成int型的伪随机数:" + random.nextInt());
        /*生成位于0到指定数字N范围的伪随机数(注意N必须为正数)*/
        System.out.println("生成位于0到指定数字范围的伪随机数" + random.nextInt(20));
        /*位于long取值范围的伪随机数*/
        System.out.println("生成long类型的伪随机数:" + random.nextLong());
    }
}
