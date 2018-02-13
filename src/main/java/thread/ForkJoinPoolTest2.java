package thread;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/**
 * @author: Hussein Chen.
 * Data: 2018/2/17
 * Time: 23:01
 * E-mail: 43138199@qq.com
 */
public class ForkJoinPoolTest2 extends RecursiveTask<Integer> {
    private static final int THRESHOLD = 20;
    private int[] arr;
    private int start;
    private int end;

    public ForkJoinPoolTest2(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int sum = 0;
        if (end - start < THRESHOLD) {
            for (int i = start; i < end; i++) {
                sum += arr[i];
            }
            return sum;
        } else {
            int middle = (end + start) / 2;
            ForkJoinPoolTest2 task1 = new ForkJoinPoolTest2(arr, start, middle);
            ForkJoinPoolTest2 task2 = new ForkJoinPoolTest2(arr, middle, end);
            task1.fork();
            task2.fork();
            return task1.join() + task2.join();
        }
    }

    public static void main(String[] args) {
        //初始化数组
        int[] arr = new int[100];
        Random rand = new Random();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(20);
            total += arr[i];
        }
        System.out.println(total);
        //创建池
        //将任务提交到池
        try {
            ForkJoinPool pool = new ForkJoinPool();
            Future<Integer> future = pool.submit(new ForkJoinPoolTest2(arr, 0, arr.length));
            System.out.println(future.get());
            pool.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
