package thread;

/**
 * @author: Hussein Chen.
 * Data: 2018/2/8
 * Time: 0:47
 * E-mail: 43138199@qq.com
 */
public class SynchronizedDrawThread extends Thread {
    private Account account;
    private double drawAmount;


    public SynchronizedDrawThread(String name, Account account, double drawAmount) {
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }

    @Override
    public void run() {
        synchronized (account) {
            if (account.getBalance() > drawAmount) {
                System.out.println(getName() + "取钱成功，取出：" + drawAmount);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account.setBalance(account.getBalance() - drawAmount);
                System.out.println("余额为：" + account.getBalance());
            } else {
                System.out.println("余额不足");
            }
        }
    }

    public static void main(String[] args) {
        Account account = new Account("123456", 1000);
        new SynchronizedDrawThread("廖银玥", account, 800).start();
        new SynchronizedDrawThread("玥玥", account, 800).start();
    }
}
