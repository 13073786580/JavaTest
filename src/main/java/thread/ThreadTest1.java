package thread;

/**
 * @author: Hussein Chen.
 * Data: 2018/2/5
 * Time: 22:05
 * E-mail: 43138199@qq.com
 */
public class ThreadTest1 extends Thread {
    private int i= 0;

    public ThreadTest1(String name) {
        this.setName(name);
    }

    public ThreadTest1() {
    }

    @Override
    public void run() {
        for ( ;i < 100; i++){
            System.out.println(this.getName() + "===" + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName() + "===" + i);
            if (i == 20) {
                //创建并启动第一个线程
                new ThreadTest1("一级攻击装置启动").start();
                //创建并启动第二个线程
                Thread thread2 = new ThreadTest1();
                thread2.setName("二级攻击装置启动");
                thread2.start();
            }
        }
    }
}
