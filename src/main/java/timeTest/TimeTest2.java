package timeTest;

import java.time.*;

/**
 * Time包练习
 *
 * Author：Edison Hou.
 * Date：2017/7/3 21:14
 * phone:17621373690
 */
public class TimeTest2 {
    public static void main(String[] args) {
        /*获取当前时间*/
        Instant instant = Instant.now();
        System.out.println(instant);

        /*在当前时间基础上添加6000秒并返回给新的instant对象*/
        Instant instant1 = instant.plusSeconds(6000);
        System.out.println(instant1);

        /*根据字符串解析并返回一个instant对象*/
        Instant instant2 =  Instant.parse("2017-07-03T13:21:09.610Z");
        System.out.println(instant2);

        /*在instant2的基础上添加5小时4分钟，并赋值给新的instant对象*/
        Instant instant3 = instant2.plus(Duration.ofHours(5).plusMinutes(4));
        System.out.println(instant3);

        /*获取instant2的五天以前的时刻，并返回给新的instant对象*/
        Instant instant4 = instant2.minus(Duration.ofDays(5));
        System.out.println(instant4);

        /*-------------下面是LocalDate(不带时区)----------------*/

        /*获取当前的日期对象*/
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        /*获取2012年的第122天的日期对象*/
        System.out.println(LocalDate.ofYearDay(2012, 122));

        /*设置一个日期为2012年12月21日的日期对象*/
        System.out.println(LocalDate.of(2012, Month.DECEMBER, 21));

        /*--------------------下面是LocalTime（不带时区）-------------------------*/

        /*获取当前时间对象*/
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        /*设置一个时间为22点22分的时间对象*/
        LocalTime localTime1 = LocalTime.of(22, 22);
        System.out.println(localTime1);

        /*返回一天当中的第5500秒的时间对象*/
        LocalTime localTime2 = LocalTime.ofSecondOfDay(5500);//一点31分40秒
        System.out.println(localTime2);

        /*--------------------------下面是LocalDateTime类----------------------------*/

        /*获取当前日期+时间对象*/
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        /*在当前时间基础上添加5小时5分钟*/
        LocalDateTime localDateTime1 = localDateTime.plusHours(5).plusMinutes(5);
        System.out.println(localDateTime1);

        /*-----------------------下面是Year，YearMonth，MonthDay类----------------------------*/
        /*获取当前年份*/
        Year year = Year.now();
        System.out.println(year);

        /*在当前年份基础上加5年，并返回一个year对象*/
        Year year1 = year.plusYears(5);
        System.out.println(year1);

        /*根据指定年份返回指定月份的yearMonth时间对象*/
        YearMonth yearMonth = year1.atMonth(7);
        System.out.println(yearMonth);

        /*在当前年月基础上加5年减3个月*/
        YearMonth yearMonth1 = yearMonth.plusYears(5).minusMonths(3);
        System.out.println(yearMonth1);

        /*获得当前月日对象*/
        MonthDay monthDay = MonthDay.now();
        System.out.println(monthDay);

        /*设置一个为7月22日的月日对象*/
        MonthDay monthDay1 = monthDay.with(Month.JULY).withDayOfMonth(22);
        System.out.println(monthDay1);
    }
}
