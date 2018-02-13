package thread;

/**
 * @author: Hussein Chen.
 * Data: 2018/2/12
 * Time: 0:50
 * E-mail: 43138199@qq.com
 */
public class Account2Deposit extends Thread {
    private SynchronizedAccount2 account2;
    private double depositAmount;

    public Account2Deposit(String name, SynchronizedAccount2 account2, double depositAmount) {
        super(name);
        this.account2 = account2;
        this.depositAmount = depositAmount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            account2.deposit(depositAmount);
        }
    }
}
