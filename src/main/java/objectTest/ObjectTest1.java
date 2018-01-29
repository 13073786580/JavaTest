package objectTest;

/**
 * Author：Edison Hou.
 * Date：2017/6/12 23:06
 * phone:17621373690
 */
public class ObjectTest1 {
    public static void main(String[] args) {
        /*Object为所有类的父类*/
        Object o = new Object();
        /*hashCode()方法返回对象的hashCode值，
        hashCode值是根据对象的地址计算得来的；
        但是很多类都重写了hashCode方法，因此并不常用；*/
        System.out.println(o.hashCode());
        /*一般情况下，toString方法返回的是object类的toString方法，
        * 值为“运行时类名@十六进制hashCode值”,但很多类都重写了hashCode方法，
        * 所以要谨慎使用*/
        System.out.println(o.toString());

    }
}
