package thread;

/**
 * 对于死亡状态的线程调用start方法会抛出IllegalThreadStateException
 * 注意，当且仅当程序处于新建状态才可调用start方法
 *
 * @author: Hussein Chen.
 * Data: 2018/2/6
 * Time: 23:44
 * E-mail: 43138199@qq.com
 */
public class ThreadTest2 extends Thread {
    private int i;

    @Override
    public void run() {
        for ( ; i < 100; i++){
            System.out.println(getName() + "===" + i);
        }
    }

    public static void main(String[] args) {
        ThreadTest2 threadTest2 = new ThreadTest2();
        for (int i = 0; i < 300; i++){
            System.out.println(Thread.currentThread().getName() + "===" + i);
            if (i == 20) {
                threadTest2.start();
                System.out.println(threadTest2.isAlive());
            }
            if (i > 20 && !threadTest2.isAlive()) {
                threadTest2.start();
            }
        }
    }
}
