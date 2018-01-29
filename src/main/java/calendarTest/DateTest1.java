package calendarTest;

import java.util.Date;

/**
 * 其实Date类是一个设计的很失败的类，JAVA官方都不推荐使用
 * 而且从JDK1.0就存在，很多方法都已经过时，使用Date过时的方法
 * 还会影响到程序的性能、安全性等方面的问题
 * 如果要获取指定时间的年、月、日、时、分、秒等信息，
 * 最好还是使用Calendar类
 *
 * Author：Edison Hou.
 * Date：2017/6/28 21:27
 * phone:17621373690
 */
public class DateTest1 {
    public static void main(String[] args) {
        /*生成代表当前日期的Date对象
        * 其实底层还是调用了System.currentTimeMills()方法*/
        Date date = new Date();
        System.out.println(date);

        /*参数为long型，表示距1970年1月1日0点后度过了N毫秒的一个时间对象*/
        Date date2 = new Date(1000);
        System.out.println(date2);

        /*判断该日期(date)是否在指定日期date2之后*/
        System.out.println(date.after(date2));

        /*判断该日期(date)是否在指定日期date2之前*/
        System.out.println(date.before(date2));

        /*返回该时间距离1970年1月1日0点的时间差，以毫秒为单位*/
        System.out.println(date.getTime());
    }
}
