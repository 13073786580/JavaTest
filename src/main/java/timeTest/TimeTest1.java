package timeTest;

import java.time.*;

/**
 * Only JDK1.8
 * Time类是JDK1.8新增的包，专门用来做时间方面的逻辑处理
 * 这里只练习了Time包下的Clock类与Duration类
 *
 * Author：Edison Hou.
 * Date：2017/6/29 22:48
 * phone:17621373690
 */
public class TimeTest1 {
    public static void main(String[] args) {
        /*获取当前时间的clock对象*/
        Clock clock = Clock.systemUTC();
        /*通过clock获取当前时刻*/
        System.out.println(clock.instant());

        /*该类获取当前时刻*/
        System.out.println(Instant.now());

        /*该类获取不带时区的日期*/
        System.out.println(LocalDate.now());

        /*该类获取不带时区的时间*/
        System.out.println(LocalTime.now());

        /*该类用来获取不带时区的日期时间*/
        System.out.println(LocalDateTime.now());

        /*该类仅获得当前月日*/
        System.out.println(MonthDay.now());

        /*该类仅代表年，获得当前年份*/
        System.out.println(Year.now());

        /*该类仅代表年月，获得当前年月*/
        System.out.println(YearMonth.now());

        /*时区化的日期时间，输出的日期带时区
        * 2017-07-03T20:50:09.760+08:00[Asia/Shanghai]
        * +8时区，亚洲上海*/
        System.out.println(ZonedDateTime.now());

        /*获取当前clock对应的毫秒数，与system.currentTimeMills相同*/
        System.out.println(clock.millis());

        /*获得一段代表6000秒持续时间的对象*/
        Duration duration = Duration.ofSeconds(6000);
        System.out.println("6000秒相当于多少分钟：" + duration.toMinutes());
        System.out.println("6000秒相当于多少小时：" + duration.toHours());
        System.out.println("6000秒相当于多少天：" + duration.toDays());
        System.out.println("6000秒相当于多少毫秒：" + duration.toMillis());

        /*在clock的基础上增加了6000秒时间，返回给新的clock2对象*/
        Clock clock2 = Clock.offset(clock, duration);
        System.out.println(clock.instant());
        System.out.println("当前时刻+6000秒为：" + clock2.instant());//加了一小时40分钟

    }

}
