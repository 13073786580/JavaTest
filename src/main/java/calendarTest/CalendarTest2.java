package calendarTest;

import java.util.Calendar;

/**
 * Calendar的容错性
 *
 * Author：Edison Hou.
 * Date：2017/6/29 22:03
 * phone:17621373690
 */
public class CalendarTest2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, 13);
        //System.out.println(calendar.getTime());

        /*calendar的set方法有可能会传入一个不合法的参数，
        * 上面的代码为月份设置的值为13，很明显是不合法的，
        * 但是依然可以输出，输出的值显然是错误的，
        * 所以下面这段代码就是关键了，将calendar的容错性设置为false，
        * 即不接受容错性，接受严格的检查
        * 这样在接收到不合法的参数时，程序会直接抛出异常
        * （calendar默认是有容错性的）*/
        calendar.setLenient(false);

        calendar.set(Calendar.MONTH, 13);
        System.out.println(calendar.getTime());
    }
}
