package thread;

/**
 * @author: Hussein Chen.
 * Data: 2018/2/9
 * Time: 0:19
 * E-mail: 43138199@qq.com
 */
public class SynchronizedAccount {
    private String accNo;
    private double balance;

    public SynchronizedAccount(double balance) {
    }

    public SynchronizedAccount(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public synchronized void draw(double drawAmount) {
        if (balance >= drawAmount) {
            System.out.println(Thread.currentThread().getName() + "取钱成功，取出：" + drawAmount);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= drawAmount;
            System.out.println("余额为：" + balance);
        } else {
            System.out.println("余额不足");
        }
    }
}
