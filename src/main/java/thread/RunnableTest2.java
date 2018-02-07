package thread;

/**
 * @author: Hussein Chen.
 * Data: 2018/2/5
 * Time: 22:40
 * E-mail: 43138199@qq.com
 */
public class RunnableTest2 implements Runnable {
    private int i;

    @Override
    public void run() {
        for ( ; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "===" + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 20) {
                RunnableTest2 runnableTest2 = new RunnableTest2();
                new Thread(runnableTest2, "一级防卫装置启动").start();
                new Thread(runnableTest2, "二级防卫装置启动").start();
            }
        }
    }
}
