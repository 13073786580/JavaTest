package thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Hussein Chen.
 * Data: 2018/2/11
 * Time: 22:34
 * E-mail: 43138199@qq.com
 */
public class ConditionAccount2 {
    private final ReentrantLock rl = new ReentrantLock();
    private final Condition cond = rl.newCondition();
    private boolean flag = false;
    private String accNo;
    private double balance;

    public ConditionAccount2() {
    }

    public ConditionAccount2(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void draw(double drwaAmount) {
        rl.lock();
        try {
            if (!flag) {
                cond.await();
            }
            if (drwaAmount >= balance) {
                System.out.println("取钱成功！取出：" + drwaAmount);
                balance -= drwaAmount;
                System.out.println("余额为：" + drwaAmount);
            } else {
                System.out.println("余额不足");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            rl.unlock();
        }
    }
}
