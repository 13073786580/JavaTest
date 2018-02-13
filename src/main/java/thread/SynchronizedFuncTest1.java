package thread;

/**
 * @author: Hussein Chen.
 * Data: 2018/2/9
 * Time: 0:11
 * E-mail: 43138199@qq.com
 */
public class SynchronizedFuncTest1 extends Thread {
    private SynchronizedAccount account;
    private double drawAmount;


    public SynchronizedFuncTest1(String name, SynchronizedAccount account, double drawAmount) {
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }


    @Override
    public synchronized void run() {
        account.draw(drawAmount);
    }

    public static void main(String[] args) {
        SynchronizedAccount account = new SynchronizedAccount("123456", 1000);
        new SynchronizedFuncTest1("廖银玥", account, 800).start();
        new SynchronizedFuncTest1("玥玥", account, 800).start();
    }
}
