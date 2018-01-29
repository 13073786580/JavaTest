package bigDecimalTest;

import java.math.BigDecimal;

/**
 * 以BigDecimal为基础的对double类型进行精确运算的工具类
 *
 * @author:Edison Hou.
 * Date：2017/6/28 20:52
 * phone:17621373690
 */
public class Arith {
    /**默认除法运算精度*/
    private static final int DEF_DIV_SCALE = 10;

   /**构造器私有化，使该类不能被实例化*/
    private Arith() {}

    /**
     * double类型的精确加法运算
     *
     * @param d1
     * @param d2
     * @return
     */
    public static double add(double d1, double d2) {
        BigDecimal b1 = BigDecimal.valueOf(d1);
        BigDecimal b2 = BigDecimal.valueOf(d2);
        return b1.add(b2).doubleValue();
    }

    /**
     * double类型的精确减法运算
     *
     * @param d1
     * @param d2
     * @return
     */
    public static double sub(double d1, double d2) {
        BigDecimal b1 = BigDecimal.valueOf(d1);
        BigDecimal b2 = BigDecimal.valueOf(d2);
        return b1.subtract(b2).doubleValue();
    }

    /**
     * double类型的精确乘法运算
     *
     * @param d1
     * @param d2
     * @return
     */
    public static double mul(double d1, double d2) {
        BigDecimal b1 = BigDecimal.valueOf(d1);
        BigDecimal b2 = BigDecimal.valueOf(d2);
        return b1.multiply(b2).doubleValue();
    }

    /**
     * double类型的精确除法运算，
     * 精确到小数点后十位（这就是精度的意思。。），
     * 并四舍五入
     *
     * @param d1
     * @param d2
     * @return
     */
    public static double div(double d1, double d2) {
        BigDecimal b1 = BigDecimal.valueOf(d1);
        BigDecimal b2 = BigDecimal.valueOf(d2);
        return b1.divide(b2, DEF_DIV_SCALE, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(Arith.add(0.005, 0.05));
        System.out.println(Arith.sub(0.0067, 0.0055));
        System.out.println(Arith.mul(0.00567,100));
        System.out.println(Arith.div(0.6, 0.03));
    }
}
