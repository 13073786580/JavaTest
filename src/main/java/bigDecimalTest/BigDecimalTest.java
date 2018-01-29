package bigDecimalTest;

import java.math.BigDecimal;

/**
 * Author：Edison Hou.
 * Date：2017/6/27 23:19
 * phone:17621373690
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        /*利用 new BigDecimal(double value)构造器创建一个BigDecimal对象，
        * 此方法并不推荐，在源码中的注释就表示，因为0.1并不能精确表示小数0.1，
        * 而是表示0.1000000000000000055511151231257827021181583404541015625，
        * 所以这个构造器具有不可预知性，
        * 源码当中推荐用String类型当参数的构造器来创建BigDecimal对象，
        * 无论何时，我们都应该优先使用String类型参数的构造器来创建BigDecimal对象*/

        BigDecimal bigDecimal = new BigDecimal(0.1);
        BigDecimal bigDecimal1 = new BigDecimal("0.1");

        System.out.println(bigDecimal + "-----" + bigDecimal1);

        /*如果出现，我们必须要使用double类型作为参数时，
        * 不要使用构造器的方法，而要使用BigDecimal的类方法valueOf来创建BigDecimal对象*/
        BigDecimal bigDecimal2 = BigDecimal.valueOf(0.1);
        System.out.println(bigDecimal2);
    }
}
