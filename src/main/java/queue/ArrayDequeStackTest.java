package queue;

import java.util.ArrayDeque;

/**
 * ArrayDeque是双端队列Deque的典型实现类。
 * Deque是可以在双端做操作的队列，
 * 可以理解为即为队列又为栈，
 * 因为队列只可以操作第一个元素
 * 栈只可以操作最后一个元素
 * 下面主要展示ArrayDeque作为栈来使用的方法
 *
 * @author: Hussein Chen.
 * Data: 2018/1/19
 * Time: 0:04
 * E-mail: 43138199@qq.com
 */
public class ArrayDequeStackTest {
    /**
     * 如果程序中有需要用到栈这种数据结构的时候，
     * 推荐使用ArrayDeque，避免使用Stack，
     * 因为Stack是古老的集合，性能较差
     * @param args
     */
    public static void main(String[] args) {
        ArrayDeque stack = new ArrayDeque();
        /*同栈的方法push()用法相同*/
        stack.addFirst("JAVA");
        stack.addFirst("PYTHON");
        stack.addFirst("C++");

        System.out.println(stack);

        /*同栈的方法peak()用法相同*/
        System.out.println(stack.getFirst());

        System.out.println(stack);

        /*同栈的方法pop()用法相同*/
        System.out.println(stack.removeFirst());

        System.out.println(stack);

    }
}
