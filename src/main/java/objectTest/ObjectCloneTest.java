package objectTest;

import entity.Entity2;

/**
 * Author：Edison Hou.
 * Date：2017/6/12 23:27
 * phone:17621373690
 */
public class ObjectCloneTest {
    /*复制这个概念，复制出来的东西终究不是原有的东西；
    * Object类的clone方法，只是对对象内的实例变量进行简单复制（不包括类变量），
    * 对于引用变量则除外，引用变量还是指向了相同的实例，
    * 因此，第一条输出为false，第二条为true*/
    public static void main(String[] args) throws CloneNotSupportedException {
        Entity2 entity2 = new Entity2("entity222");
        Entity2 entity22 = entity2.clone();

        System.out.println(entity2 == entity22);

        System.out.println(entity2.getEntity() == entity22.getEntity());
        /*clone也有着很重要的用处，比如：我们需要复制一个数组元素，有两种方法
        * 如下：*/
        int[] ints = new int[100];
        int[] ints2 = new int[200];
        //原数组，原数组起始位置，目的数组，目的数组起始位置，复制长度
        System.arraycopy(ints,0,ints2,0,100);
        /*clone()的速度要比System的类方法快近2倍
        * 但是clone的弊端就是只能整体复制，不能选位置复制*/
        ints2 = ints.clone();
    }
}
