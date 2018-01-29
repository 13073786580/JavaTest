package threadTest;

/**
 * Author Edison Hou.
 * Date: 2017/7/7,
 * Time: 19:54,
 * phone:17621373690
 */
public class ThreadTest1 {
    static int a = 1;

    public static void main(String[] args) {
        new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    a = a++;
                }
                System.out.println(a);
            }
        }.run();

        new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    a = a--;
                }
                System.out.println(a);
            }
        }.run();

        System.out.println(a);
    }
}
