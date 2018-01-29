package scannerTest;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Author：Edison Hou.
 * Date：2017/6/11 20:54
 * phone:17621373690
 */
public class ScannerTest1 {
    public static void test1() {
        Date date = Calendar.getInstance().getTime();
        boolean b = Calendar.getInstance().after(date);
        System.out.println(date.toString());
        System.out.println(b);
    }

    public static void main(String[] args) {
        test1();
        System.out.println(args.length);

        Scanner scanner = new Scanner(System.in);
        /*该行表示，只用回车作为分隔符;经测试表明，不加这行代码，程序会认为你的输入在空格处中断了，
        所以，输入内容会以两行的形式打印出来；而加上这行代码，就会把空格也作为输入内容，打印在控制面板，
        两行内容变成了一行输出，所以以后编程还是加上这句话吧*/
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            System.out.println(scanner.next() + "000");
        }
        /*Scanner还有判断是否有对应输入类型的方法，如果是对应类型既返回true，
          没有的话就会直接退出程序*/
        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        }
        /*Scanner还有读取文件的方法*/

    }
}
