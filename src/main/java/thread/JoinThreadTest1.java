package thread;

/**
 * @author: Hussein Chen.
 * Data: 2018/2/6
 * Time: 23:54
 * E-mail: 43138199@qq.com
 */
public class JoinThreadTest1 extends Thread {

    public JoinThreadTest1 (String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <100; i++) {
            System.out.println(getName() + "===" + i);
        }
    }

    public static void main(String[] args) {
        new JoinThreadTest1("子线程").start();
        for (int i = 0; i <100; i++) {
            if (i == 20) {
                JoinThreadTest1 joinThreadTest1 = new JoinThreadTest1("join的线程");
                joinThreadTest1.start();
                try {
                    joinThreadTest1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "===" + i);
        }
    }
}
