package calendarTest;

import java.util.Calendar;

/**
 * Calendar的延迟修改
 *
 * Author：Edison Hou.
 * Date：2017/6/29 22:19
 * phone:17621373690
 */
public class CalendarTest3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2003, 7 ,31);//2003-8-31
        /*这里是一个关键点，我们先为这个Calendar对象设置的时间为2003-8-31，
        * 接着设置了他的月份为9月份，但是9月并没有31日，
        * 所以这时候输出的calendar对象的时间为2003-10-1*/
        calendar.set(Calendar.MONTH, 8);
        //System.out.println(calendar.getTime());

        calendar.set(Calendar.DATE, 5);
        System.out.println(calendar.getTime());
        /*
        * 当我们注释到第一个输出语句的时候会发现一个问题，
        * 按照计算机的原理来看，当时第二次调用set方法后，
        * 存储的calendar实例代表的已经是2003-10-1的时间了，
        * 这时候再对这个实例设置date字段的值，应该是10-5号才对，
        * 但是最终结果却是9-5
        *
        * 原因是因为calendar方法有一个延迟修改的功能，我们调用set方法并不会立即对calendar实例进行修改，
        * 而是会等到下一次调用get方法的时候才会统一对执行之前的所有set方法，
        * 这样的好处在于，首先减少了占用CPU的性能，减少了计算时间
        * 其次也方便了计算机对于这些设置值进行更合理的计算，避免出现不符合我们预期的值
        */


    }
}
