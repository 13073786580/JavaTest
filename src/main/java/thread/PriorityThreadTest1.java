package thread;

/**
 * @author: Hussein Chen.
 * Data: 2018/2/7
 * Time: 23:30
 * E-mail: 43138199@qq.com
 */
public class PriorityThreadTest1 extends Thread {
    public PriorityThreadTest1 (String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "，其优先级为" + getPriority() + "===" + i);
        }
    }

    public static void main(String[] args) {
        Thread.currentThread().setPriority(6);
        for (int i = 0; i < 50; i++) {
            if (i == 20) {
                PriorityThreadTest1 pt = new PriorityThreadTest1("低级");
                pt.start();
                pt.setPriority(Thread.MIN_PRIORITY);
            }
            if (i == 30) {
                PriorityThreadTest1 pt2 = new PriorityThreadTest1("高级");
                pt2.start();
                pt2.setPriority(Thread.MAX_PRIORITY);
            }
        }
    }
}
