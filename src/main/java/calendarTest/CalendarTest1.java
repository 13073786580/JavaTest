package calendarTest;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar类是一个抽象类，所以只能获通过类方法getInstance()来获得实例
 * Calendar类具有很多子类，对应了各种的纪年类型，如公元日历，中国农历等
 * 要使用Calendar类设置时间对象，都使用到了静态导入，将Calendar的类变量都导入进来，
 * 所以才能使用Calendar类的YEAR/MONTH/DATE等类变量
 *
 * Author：Edison Hou.
 * Date：2017/6/21 15:45
 * phone:17621373690
 */
public class CalendarTest1 {
    public static void main(String[] args) {
        /*Gregorian Calendar 公元日历*/

        /*创建默认的Calendar对象*/
        Calendar calendar = Calendar.getInstance();

        /*从Calendar对象中取出Date对象*/
        Date date = calendar.getTime();

        /*add(); 对指定的时间的年或月等属性进行增加或减少
        * add会使前一字段进位，如果后一字段也需要变化，则后一字段修改到变化幅度最小的值
        * 比如3月31日，使其月份减少1，但2月没有31日，则会变为2月29日*/
        calendar.add(Calendar.YEAR, 1);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.MONTH, 8);
        System.out.println(calendar.getTime());

        Calendar calendar1 = Calendar.getInstance();
         /*该方法和add()类似，区别在于roll操作的字段超过最大值或最小值也不会进位，
        * 超过之后，上一字段是不会变化的，
        * 而下一字段的变化和add方法相似*/
        calendar1.roll(Calendar.DATE, 1);
        System.out.println(calendar1.getTime());

        /*calendar的成员方法get，是取对应的属性的值，如：年、月、日；
            just my opinion，获取月份的时候，貌似是取的下标，一月份对应的下标是0，
            所以我们要获得真正的月份，要再+1*/
        System.out.println(calendar1.get(Calendar.YEAR)  + "---" + calendar1.get(Calendar.MONTH));

        /*获得该时间指定字段的最大或最小值，如月份的最大值为11，最小值为0*/
        System.out.println(calendar1.getActualMaximum(Calendar.MONTH) + "+++" + calendar1.getActualMinimum(Calendar.MONTH));



        Calendar calendar2 = Calendar.getInstance();
        /*设定时间指定属性为指定值*/
        calendar2.set(Calendar.MONTH, 0);
        System.out.println("设定时间的指定属性为指定值：" + calendar2.getTime());

        /*直接设定年月日*/
        calendar2.set(2012, 11, 21);
        System.out.println("设定了指定年月日的日期：" + calendar2.getTime());

        /*还有直接设置年月日时分秒的方法*/
        calendar2.set(2012, 11, 21, 11, 11, 11);
        System.out.println("设定了指定年月日时分秒的时间对象：" + calendar2.getTime());

        calendar1.set(2017,6,1);
        System.out.println(calendar.compareTo(calendar1));

    }
}
