package objectsTest;

import java.util.Objects;

/**
 * @Author：Hussein Chen.
 * Date：2017/6/13 22:32
 * phone:17621373690
 */
public class ObjectsTest1 {
    /*注意这个Objects类不是我们所说的所有类的父类Object，
    * 而是jdk1.7新增的一个工具类，封装了对对象的一些操作*/

    static ObjectsTest1 obj;

    public static void main(String[] args) {
        /*输出一个null对象的hashcode值，值为0*/
        System.out.println(Objects.hashCode(obj));
        /*输出一个null对象的toString，值为null*/
        System.out.println(Objects.toString(obj));
        /*返回一个对象，如果该对象为null则引发异常，如果不为null则返回该对象*/
        //System.out.println(Objects.requireNonNull(obj) + "obj参数不能为null");

        String a1 = new String("123");
        String a2 = new String("123");
        /*使用objects工具类判断是否相等的主要好处就在于
        * ，之前我们为了避免空指针异常，我们通常把一个确定值的变量或者是常亮作为调用方法的一方
        * ，而使用工具类就不需要再考虑空指针异常的问题*/
        System.out.println(Objects.equals(a1, a2));

    }
}
