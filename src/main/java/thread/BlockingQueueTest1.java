package thread;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author: Hussein Chen.
 * Data: 2018/2/13
 * Time: 0:47
 * E-mail: 43138199@qq.com
 */
public class BlockingQueueTest1 {
    static class Producer extends Thread {
        private Integer num;
        private BlockingQueue blockingQueue;

        public Producer(BlockingQueue blockingQueue, Integer num) {
            this.blockingQueue = blockingQueue;
            this.num = num;
        }

        @Override
        public void run() {
            String[] strings = new String[] {
                    "廖银玥",
                    "玥玥",
                    "银玥"
            };
            for (int i = 0; i < 30; i++) {
                System.out.println(getName() + "生产者准备放入元素");
                try {
                    Thread.sleep(200);
                    blockingQueue.put(strings[i % 3]);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName() + "放入完成" + blockingQueue + num++);
            }
        }
    }

    static class Consumer extends Thread {
        private int num = 1;
        private BlockingQueue blockingQueue;

        public Consumer(BlockingQueue blockingQueue) {
            this.blockingQueue = blockingQueue;
        }

        @Override
        public void run() {
            while (true) {
                System.out.println(getName() + "消费者取出元素");
                try {
                    Thread.sleep(200);
                    blockingQueue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName() + "消费完成" + blockingQueue + num++);
            }
        }
    }

    public static void main(String[] args) {
        BlockingQueue bq = new ArrayBlockingQueue(1);
        Integer num = new Integer(1);
        new Producer(bq, num).start();
        new Producer(bq, num).start();
        new Producer(bq, num).start();
        new Consumer(bq).start();
    }
}
