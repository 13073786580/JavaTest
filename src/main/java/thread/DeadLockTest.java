package thread;

/**
 * @author: Hussein Chen.
 * Data: 2018/2/11
 * Time: 23:08
 * E-mail: 43138199@qq.com
 */
public class DeadLockTest extends Thread {
    A a = new A();
    B b = new B();

    @Override
    public void run() {
        Thread.currentThread().setName("副线程");
        b.bar(a);
        System.out.println("副线程执行毕");
    }

    public void init() {
        Thread.currentThread().setName("主线程");
        a.foo(b);
        System.out.println("主线程执行完毕");
    }

    public static void main(String[] args) {
        DeadLockTest dl = new DeadLockTest();
        new Thread(dl).start();
        dl.init();
    }

    static class A {
        public synchronized void foo (B b) {
            System.out.println("当前线程：" + Thread.currentThread().getName() + "，进入了A实例的foo方法");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("当前线程：" + Thread.currentThread().getName() + "，试图调用B对象的last方法");
            b.last();
        }

        public synchronized void last () {
            System.out.println("进入了A实例的last方法");
        }
    }

    static class B {
        public synchronized void bar (A a) {
            System.out.println("当前线程：" + Thread.currentThread().getName() + "，进入了B实例的bar方法");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("当前线程：" + Thread.currentThread().getName() + "，试图调用A对象的last方法");
            a.last();
        }

        public synchronized void last () {
            System.out.println("进入了B实例的last方法");
        }
    }

}
