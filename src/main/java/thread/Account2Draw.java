package thread;

/**
 * @author: Hussein Chen.
 * Data: 2018/2/12
 * Time: 0:48
 * E-mail: 43138199@qq.com
 */
public class Account2Draw extends Thread {
    private SynchronizedAccount2 account2;
    private double drawAmount;

    public Account2Draw(String name, SynchronizedAccount2 account2, double drawAmount) {
        super(name);
        this.account2 = account2;
        this.drawAmount = drawAmount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            account2.draw(drawAmount);
        }
    }

    /**
     * 执行结果看到最后余额提示为888.0元，
     * 这是因为，取钱的只有一个，取100次之后线程死亡，
     * 而存款者有3个，他们每次只能有1个在存钱，这3个总共跑了有100次，
     * 但是肯定单个都不够100次（不一定，但至少有两个线程会执行不完进入阻塞无人唤醒），
     * 这时没人给flag
     * @param args
     */
    public static void main(String[] args) {
        SynchronizedAccount2 account = new SynchronizedAccount2("廖银玥", 0);
        new Account2Draw("取钱的", account, 888).start();
        new Account2Deposit("存钱者1", account, 888).start();
        new Account2Deposit("存钱者2", account, 888).start();
        new Account2Deposit("存钱者3", account, 888).start();
    }
}
