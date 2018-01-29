package collectionTest;


import java.util.stream.IntStream;

/**
 * 使用stream操作流应当注意，调用的方法是中间方法还是末端方法
 * 末端方法调用后流会关闭，接下来无法再做操作
 * 中间方法调用后仍能对流进行操作
 *
 * Tips：有一个filter()方法，用来过滤集合中的元素，
 * 但是注意，这里的过滤不是过滤掉符合你输入的条件的元素，
 * 而是把符合条件的留下来，把不符合条件的元素剔除出去
 *
 * @author: Hussein Chen.
 * Data: 2017/12/24
 * Time: 16:02
 * E-mail: 43138199@qq.com
 */
public class StreamTest1 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.builder()
                .add(1)
                .add(2)
                .add(3).build();
        /*下列方法只能调用一次，调用过后流会自动关闭，接下来的方法再执行就会报错*/
//        System.out.println(intStream.max().getAsInt());
//        System.out.println(intStream.min().getAsInt());
        /*判断集合中的元素是否都符合条件，返回Boolean变量值*/
//        System.out.println(intStream.allMatch(ele -> ele * ele > 0));

        /*map()方法是用来对集合中的数据做统一的操作并返回的，
        * 而不是用来做判断返回符合条件的集合中的元素*/
        IntStream intStream2 = intStream.map(ele -> ele + 1);
//        intStream2.forEach(System.out :: println);

        IntStream intStream3 = intStream2.filter(ele -> ele == 4);
        intStream3.forEach(System.out :: println);
    }
}
