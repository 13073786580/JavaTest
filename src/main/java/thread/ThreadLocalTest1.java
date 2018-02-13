package thread;

/**
 * @author: Hussein Chen.
 * Data: 2018/2/17
 * Time: 23:54
 * E-mail: 43138199@qq.com
 */
public class ThreadLocalTest1 extends Thread {
    private Account account;

    public ThreadLocalTest1(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        System.out.println(account);
        for (int i = 0; i < 20; i++) {
            if (i == 8) {
                account.setName(getName());
            }
            System.out.println(account.getName() + "账户的i值为：" + i);
        }
    }

    public static void main(String[] args) {
        Account account = new Account("主线程");
        new ThreadLocalTest1("甲线程", account).start();
        new ThreadLocalTest1("乙线程", account).start();
    }

    static class Account {
        private ThreadLocal<String> name = new ThreadLocal<>();

        public Account(String name) {
            this.name.set(name);
            System.out.println("===" + this.name.get());
        }

        public String getName() {
            return this.name.get();
        }

        public void setName(String name) {
            this.name.set(name);
        }

        @Override
        public String toString() {
            return "Account{" +
                    "name=" + this.name.get() +
                    '}';
        }
    }
}
