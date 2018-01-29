import entity.Entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Author：Edison Hou.
 * Date：2017/7/6 10:33
 * phone:17621373690
 */
public class Test{

    public static void main(String[] args) {
        /*2017年7月7日15:39:51*/
        Entity entity = new Entity();
        entity.setEntityName("侯松辰");
        System.out.println(entity.toString());

        /*2017年7月7日15:39:58
        * 一个简单测试，split后的预期效果应该为length为4的数组
        * ，但结果为长度为3的数组*/
        String str = "1,2,3,,";
        String[] strArr = str.split(",");
        System.out.println(strArr.length);

        /*2017年7月7日15:40:06
        * 测试List的subList方法*/
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        List<Integer> integerList1 = integerList.subList(0, 2);//subList也是含头不含尾
        for (int i = 0; i < integerList1.size(); i++) {
            System.out.println(integerList1.get(i));
        }

        /*2017年7月7日15:54:07
        * 在需要使用List转Array的时候，
        * 一定要使用List的带参成员方法toArray(T[] arr),
        * 无参方法返回的是Onjects[],
        * 所以在强转为其他类型的时候，很可能会出现ClassCastException*/
        Integer[] integers = new Integer[integerList.size()];
        integers = integerList.toArray(integers);
        for (int i = 0; i < integers.length; i++) {
            System.out.println("111:" + integers[i]);
        }

        /*2017年7月7日16:09:02
        * 工具类Arrays的asList方法把数组转换为集合时，
        * 1.不能使用其修改集合时的相关方法（如：add，remove，clear），
        * 会抛出UnsupportedOperationException异常
        *
        * 2.asList方法体现的是适配器模式，其实只是转换了接口，
        * 后台的数据仍是数组，所以，如果数组变化了，那么数组转换的集合其对应的值也变化了*/
        String[] strings = new String[]{"a", "b"};
        List list = Arrays.asList(strings);
        //list.add("c");
        strings[0] = "d";
        System.out.println(list.get(0));//输出d

        /*2017年7月7日17:03:03
        * 不要在foreach的循环里进行集合的remove/add操作，
        * 如果要remove请使用Iterator方式，
        * 如果并发操作，需要对Iterator对象加锁*/
        List<String> strings1 = new ArrayList<String>();
        strings1.add("a");
        strings1.add("b");
        for (String str2:strings1) {
            if ("a".equals(str2)){
                strings1.remove(str2);
            }
        }
        Iterator<String> stringIterator = strings1.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }

        /*2017年7月7日17:27:49
        * 集合初始化时，最好指定集合初始值的大小*/
        List<String> stringList = new ArrayList<String>(16);
    }
}
