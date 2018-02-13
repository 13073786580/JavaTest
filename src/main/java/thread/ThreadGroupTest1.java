package thread;

/**
 * Created by edianzu on 2018/2/13.
 */
public class ThreadGroupTest1 {
    public static void main(String[] args) {
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        System.out.println("主线程组名" + mainGroup.getName());
        System.out.println("主线程组是否为后台线程组" + mainGroup.isDaemon());
        new MyThread("主线程组的线程").start();

        ThreadGroup newGroup = new ThreadGroup("新线程组");
        newGroup.setDaemon(true);
        System.out.println("新线程组是否为后台线程：" + newGroup.isDaemon());
        Thread tt1 = new MyThread(newGroup, "新线程组的一号");
        tt1.start();
        new MyThread(newGroup, "新线程组的二号").start();
    }

    static class MyThread extends Thread {
        public MyThread(String name) {
            super(name);
        }

        public MyThread(ThreadGroup group, String name) {
            super(group, name);
        }

        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                System.out.println(getName() + "线程的i变量：" + i);
            }
        }
    }
}
