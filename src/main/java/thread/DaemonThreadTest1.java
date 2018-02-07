package thread;

/**
 * 后台线程在前台线程执行完后会自动死亡。
 *
 * 根据运行结果我们可以看到，本来子线程应该执行到1000，
 * 但是由于前台线程已经执行结束，所以后台线程自动死亡了
 *
 * @author: Hussein Chen.
 * Data: 2018/2/7
 * Time: 0:12
 * E-mail: 43138199@qq.com
 */
public class DaemonThreadTest1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName() + "===" + i);
        }
    }

    public static void main(String[] args) {
        DaemonThreadTest1 dt = new DaemonThreadTest1();
        //设置一个线程为后台线程必须在其start之前
        dt.setDaemon(true);
        dt.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "===" + i);
        }
    }
}
