package thread;

/**
 * 多线程经典的取钱问题，当两个线程同时执行，第一个线程判断了余额在还没有扣钱的时候，
 * 第二个线程进来了，判断了余额扣了钱执行完毕，
 * 这时候第一个线程再次获得系统资源继续扣钱，
 * 两个线程都成功扣了钱，余额变为负数。
 *
 * @author: Hussein Chen.
 * Data: 2018/2/8
 * Time: 0:34
 * E-mail: 43138199@qq.com
 */
public class DrawThread extends Thread {
    private Account account;
    private double drawAmount;


    public DrawThread(String name, Account account, double drawAmount) {
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }

    @Override
    public void run() {
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

    public static void main(String[] args) {
        Account account = new Account("123456", 1000);
        new DrawThread("廖银玥", account, 800).start();
        new DrawThread("玥玥", account, 800).start();
    }
}
