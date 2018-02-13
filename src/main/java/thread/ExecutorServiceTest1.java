package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by edianzu on 2018/2/13.
 */
public class ExecutorServiceTest1 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(6);
        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "===" +i);
                }
            }
        };
        pool.submit(target);
        pool.submit(target);
        pool.shutdown();
    }
}
