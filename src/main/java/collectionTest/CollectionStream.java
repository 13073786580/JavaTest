package collectionTest;

import java.util.stream.IntStream;

/**
 * Java8新增Stream操作集合
 *
 * @Author: HouZ,
 * Data: 2017/10/9,
 * Time: 22:49
 */
public class CollectionStream {
    public static void main(String[] args) {
        /*创建流并向其中添加int元素*/
        IntStream intStream = IntStream.builder()
                .add(20)
                .add(13)
                .add(-2)
                .add(18).build();
        /*以下所有聚集方法都只能执行一次，
        * 因为每次调用聚集方法都是对流的最终操作，
        * 操作完后流会关闭，所有之后所有操作stream的方法均无法再调用，
        * 这种方法称作末端方法*/

        /*当然也有中间方法，即操作后流不会关闭的方法，
        * 我们在CollectionStream2中会举例展示中间方法的应用*/
//        System.out.println("is中所有元素的最大值：" + intStream.max().getAsInt());
//        System.out.println("is中所有元素的最小值：" + intStream.min().getAsInt());
//        System.out.println("is中所有元素的总和：" + intStream.sum());
//        System.out.println("is中元素的总数：" + intStream.count());
//        System.out.println("is中所有元素的平均值：" + intStream.average());
//        System.out.println("is中所有元素的平方是否都大于20："
//                            + intStream.allMatch(ele -> ele * ele > 20));
        /*将intStream映射至一个新的intStream*/
        IntStream intStream2 = intStream.map(ele -> ele);
        /*使用Lambda方法引用的方式来遍历集合元素*/
        intStream2.forEach(System.out::println);
    }
}
