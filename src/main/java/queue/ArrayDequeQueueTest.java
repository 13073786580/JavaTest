package queue;

import java.util.ArrayDeque;

/**
 * 这里展示的是ArrayDeque作为队列的使用方法，
 * 和作为栈使用的时候区别起来只要注意一点，
 * 栈为后进先出，队列为先进先出，
 * 就不会弄混方法的调用
 *
 * 主要也就区别在想ArrayDeque中放入元素的方法，
 * 栈要向后放，故调用addFirst()，
 * 队列为先进先出，故调用addLast()。
 *
 * @author: Hussein Chen.
 * Data: 2018/1/19
 * Time: 0:14
 * E-mail: 43138199@qq.com
 */
public class ArrayDequeQueueTest {
    public static void main(String[] args) {
        ArrayDeque queue = new ArrayDeque();

        queue.addLast("JAVA");
        queue.addLast("PYTHON");
        queue.addLast("C++");

        System.out.println(queue);

        System.out.println(queue.getFirst());

        System.out.println(queue);

        System.out.println(queue.removeFirst());

        System.out.println(queue);
    }
}
