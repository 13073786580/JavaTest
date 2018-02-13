package thread;

/**
 * Created by edianzu on 2018/2/13.
 */
public class UncaughtExceptionHandler {
    public static void main(String[] args) {
        Thread.currentThread().setDefaultUncaughtExceptionHandler(new Handler());
        int num = 3/0;
        System.out.println("程序正常结束");
    }

    static class Handler implements Thread.UncaughtExceptionHandler {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            if (!(e instanceof ThreadDeath)) {
                System.out.println(Thread.currentThread().getName() + "出异常了");
                e.printStackTrace();
            }
        }
    }
}
