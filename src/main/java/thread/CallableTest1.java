package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author: Hussein Chen.
 * Data: 2018/2/6
 * Time: 1:12
 * E-mail: 43138199@qq.com
 */
public class CallableTest1 {
    public static void main(String[] args) {
        //使用Lambda表达式创建Callable对象
        //使用FutureTask类来包装Callable对象
        FutureTask<Integer> futureTask = new FutureTask<Integer>((Callable<Integer>)() ->{
            int i = 0;
            for ( ; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "===" + i);
            }
            Thread.sleep(5000);
            return i;
        });
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "===" + i);
            if (i == 20) {
                new Thread(futureTask, "有返回值的线程").start();
            }
        }
        try {
            /*通过futureTask的get方法获得Callable对象的call方法的返回值
            * 通过该方法会使调用get方法的线程阻塞，知道call方法执行结束，
            * 可以看到我们让创建的线程睡眠了5秒，知道这5秒结束下行代码才输出出来*/
            System.out.println(futureTask.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
