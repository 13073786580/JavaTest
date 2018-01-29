package systemTest;

/**
 * Author：Edison Hou.
 * Date：2017/6/11 22:33
 * phone:17621373690
 */
public class SystemTest1 {
    public static void main(String[] args) {
        /*获取环境变量，参数为环境变量名*/
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println(javaHome);

        /*获取系统属性，参数为系统属性名*/
        String os = System.getProperty("os.name");
        System.out.println(os);

        /*系统当前时间，输出的是与1970/1/1日午夜的时间差，单位为毫秒*/
        System.out.println(System.currentTimeMillis());

        /*系统当前时间，与1970/1/1日午夜的时间差，单位为纳秒*/
        System.out.println(System.nanoTime());
        /*以上两方法慎用，须指出的是，很多操作系统不支持太细的时间单位，所以返回值很可能不精确*/

        String s1 = "hello baby";
        String s2 = "hello baby";
        System.out.println(s1.equals(s2));
        System.out.println(System.identityHashCode(s1) == System.identityHashCode(s2));

        String s3 = "hello baby";
        String s4 = "hello baby";
        System.out.println(System.identityHashCode(s3) == System.identityHashCode(s4));
        /*通过System.identityHashCode()方法，我们可以获得对象的hashcode值
        * 这个方法是根据该对象的地址计算得到的hashcode值，
        * 因为有很多类可能重写过hashcode方法，
        * 所以这个方法是最保险的判断两个对象是否相等的方法*/

    }
}
