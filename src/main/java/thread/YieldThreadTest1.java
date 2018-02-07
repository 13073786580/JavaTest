package thread;

/**
 * @author: Hussein Chen.
 * Data: 2018/2/7
 * Time: 23:08
 * E-mail: 43138199@qq.com
 */
public class YieldThreadTest1 extends Thread {

    public YieldThreadTest1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "===" + i);
            if (i == 20) {
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        YieldThreadTest1 yt = new YieldThreadTest1("高级");
        yt.setPriority(Thread.MAX_PRIORITY);
        yt.start();
        YieldThreadTest1 yt2 = new YieldThreadTest1("低级");
        yt2.setPriority(Thread.MIN_PRIORITY);
        yt2.start();
    }
}
