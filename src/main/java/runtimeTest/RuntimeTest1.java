package runtimeTest;

/**
 * Author：Edison Hou.
 * Date：2017/6/12 22:36
 * phone:17621373690
 */
public class RuntimeTest1 {
    public static void main(String[] args) {
        /*每个java程序都对应了一个Runtime类的实例，
        * 因为运行时环境是固定的，所以我们不能创建
        * 只能通过类方法去获得他的实例，
        * 通过runtime实例，我们可以访问JVM的信息，如下 */
        Runtime runtime = Runtime.getRuntime();
        /*输出处理器的数量*/
        System.out.println(runtime.availableProcessors());
        /*空闲内存数量*/
        System.out.println(runtime.freeMemory());
        /*可用最大内存数*/
        System.out.println(runtime.maxMemory());
        /*总内存数*/
        System.out.println(runtime.totalMemory());
    }
}
