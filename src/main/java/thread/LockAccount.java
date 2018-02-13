package thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Hussein Chen.
 * Data: 2018/2/11
 * Time: 22:34
 * E-mail: 43138199@qq.com
 */
public class LockAccount {
    private final ReentrantLock rl = new ReentrantLock();
    private final Condition cond = rl.newCondition();
    private boolean flag = false;
    private String accNo;
    private double balance;

    public LockAccount() {
    }

    public LockAccount(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void draw(double drwaAmount) {
        rl.lock();
        try {
            if (drwaAmount >= balance) {
                System.out.println("取钱成功！取出：" + drwaAmount);
                balance -= drwaAmount;
                System.out.println("余额为：" + drwaAmount);
                flag = false;
                cond.signalAll();
            } else {
                System.out.println("余额不足");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            rl.unlock();
        }
    }

    public void deposit(double depositAmount) {
        rl.lock();
        try {
            if (flag) {
                cond.await();
            } else {
                System.out.println("存钱成功，存入：" + depositAmount);
                balance += depositAmount;
                System.out.println("余额为：" + balance);
                flag = true;
                cond.signalAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            rl.unlock();
        }
    }
}
