package thread;

/**
 * @author: Hussein Chen.
 * Data: 2018/2/12
 * Time: 0:36
 * E-mail: 43138199@qq.com
 */
public class SynchronizedAccount2 {
    private String accNo;
    private double balance;
    private boolean flag = false;

    public SynchronizedAccount2() {
    }

    public SynchronizedAccount2(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public synchronized void draw(double drawAmount) {
        //如果为false代表账户中没钱，取钱方法阻塞
        try {
            if (!flag) {
                this.wait();
            } else {
                System.out.println(Thread.currentThread().getName() + "取钱：" + drawAmount);
                balance -= drawAmount;
                System.out.println("余额：" + balance);
                flag = false;
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void deposit(double depositAmount) {
        try {
            System.out.println(Thread.currentThread().getName() + "开始存钱");
            if (flag) {
                wait();
            } else {
                System.out.println(Thread.currentThread().getName() + "存钱：" + depositAmount);
                balance += depositAmount;
                System.out.println("余额：" + balance);
                flag = true;
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
