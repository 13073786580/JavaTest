package thread;

/**
 * @author: Hussein Chen.
 * Data: 2018/2/8
 * Time: 0:32
 * E-mail: 43138199@qq.com
 */
public class Account {
    private String accNo;
    private double balance;

    public Account(double balance) {
    }

    public Account(String accNo, double balance) {
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

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
