package stringTest;

/**
 * Author：Edison Hou.
 * Date：2017/6/19 23:08
 * phone:17621373690
 */
public class StringBuliderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        //追加
        stringBuilder.append("baby");
        System.out.println(stringBuilder);
        //增加
        stringBuilder.insert(0, "hello ");
        System.out.println(stringBuilder);
        //替换(5代表起始位置，6代表结束位置，含头不含尾)
        stringBuilder.replace(5,6,",");
        System.out.println(stringBuilder);
        //删除(5代表起始位置，6代表结束位置，含头不含尾)
        stringBuilder.delete(5,6);
        System.out.println(stringBuilder);
        //反转
        System.out.println(stringBuilder.reverse());
        //输出长度
        System.out.println(stringBuilder.length());
        /*输出容量，这里注意，一个StringBuilder的容量是从创建他的时候就订好的，
        * 如果为空则默认为16位，append的时候只要不超过16位就不会扩展容量，
        * 超过16位后，按原容量*2+2的规则扩展容量，如果还超过*2+2后的容量，
        * 则将append后的长度作为容量；
        * 如，原始容量为16，*2+2后为34，不超过16用16，
        * 超过16不超过34用34，超过34则用append后的容量*/
        System.out.println(stringBuilder.capacity());
        stringBuilder.append("gggggggg");
        System.out.println("长度：" + stringBuilder.length() + "容量" + stringBuilder.capacity());

        /*一个新建的有内容的StringBuilder，则按内容所占容量+16为起始容量*/
        StringBuilder stringBuilder1 = new StringBuilder("ggggggggg");
        System.out.println(stringBuilder1.length());
        System.out.println(stringBuilder1.capacity());

        //设置长度，只保留从0起始的设置长度的字符
        stringBuilder.setLength(5);
        System.out.println(stringBuilder);
    }
}
