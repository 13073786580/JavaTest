package queue;

import java.util.PriorityQueue;

/**
 * PriorityQueue是相对标准的队列实现类，
 * 但不是绝对标准的队列实现类，
 * 因为其并非按照队列的先进先出的形式来排列的
 * 默认是按照元素大小来排列的
 *
 * @author: Hussein Chen.
 * Data: 2018/1/18
 * Time: 0:26
 * E-mail: 43138199@qq.com
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.offer(6);
        pq.offer(-3);
        pq.offer(20);
        pq.offer(18);

        /*这里的输出结果为[-3, 6, 20, 18]，
        * 并不是因为队列中的排列顺序杂乱才使输出结果杂乱的，
        * 而是由于PriorityQueue对象的toString方法才造成的，
        * 其实际的排列顺序如下代码的输出结果可以看到。*/
        System.out.println(pq);

        /*可以看到输出的顺序是按队列中的元素大小来的，
        * 另外poll方法为取出队列中的第一个元素并从队列中删除掉它，
        * peak方法为取出队列中的第一个元素而不删除*/
        while (0 != pq.size()) {
            System.out.println(pq.poll());
        }
    }
}
