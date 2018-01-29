package mathTest;

/**
 * @author: Hussein Chen.
 * Date：2017/6/21 22:34
 * E-mail: 43138199@qq.com
 */
public class MathTest1 {
    public static void main(String[] args) {
        /*Math类大部分都是类方法，没有成员方法，有两个类变量，分别为PI和e，分别对应圆周率和。。（第二个已经忘了是什么了）
        * Math中有很多数学相关的方法，比如：取正弦、余弦、正切、余切；弧度和角度互相转换，等多种数学方法；
        * 这里我们只练习了较为常用的方法，其实有很多还是有很多基本用不到的方法，哈哈哈哈！*/

        /*向下取整，取最大值*/
        System.out.println(Math.floor(1.2));
        /*向上取整，取最小值*/
        System.out.println(Math.ceil(1.2));
        /*四舍五入*/
        System.out.println(Math.round(3.5) + ":" + Math.round(3.2));
        /*乘方*/
        System.out.println("3的2次方：" + Math.pow(3,2));
        System.out.println("3的3次方：" + Math.pow(3,3));
        /*平方根*/
        System.out.println("9的平方根:" + Math.sqrt(9));
        /*立方根*/
        System.out.println("8的立方根:" + Math.cbrt(8));
        /*绝对值*/
        System.out.println("-4.5的绝对值:" + Math.abs(-4.5));
        /*取符号,为0取0.0，大于0取1.0，小于0取-1.0*/
        System.out.println(Math.signum(-4.5));
        System.out.println(Math.signum(5.5));
        System.out.println(Math.signum(0));
        /*找到最大值，只能比较两个数之间的大小*/
        System.out.println(Math.max(3,5));
        /*找到最小值，只能比较两个数之间的大小*/
        System.out.println(Math.min(3,5));
        /*最常用的方法，取大于等于0到小于1之间的随机数*/
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }
    }
}
