package thread;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.TimeUnit;

/**
 * @author: Hussein Chen.
 * Data: 2018/2/17
 * Time: 22:33
 * E-mail: 43138199@qq.com
 */
public class ForkJoinPoolTest1 extends RecursiveAction {
    private static final int THRESHOLD = 50;
    private int start;
    private int end;

    public ForkJoinPoolTest1 (int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if (THRESHOLD > end - start) {
            for (int i = start; i < end ; i++) {
                System.out.println(Thread.currentThread().getName() + "：" + i);
            }
        } else {
            int middle = (end - start) / 2;
            ForkJoinPoolTest1 left = new ForkJoinPoolTest1(start, middle);
            ForkJoinPoolTest1 right = new ForkJoinPoolTest1(middle, end);
            left.fork();
            right.fork();
        }
    }

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(new ForkJoinPoolTest1(0, 300));
        try {
            pool.awaitTermination(2, TimeUnit.SECONDS);
            pool.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
