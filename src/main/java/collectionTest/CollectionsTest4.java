package collectionTest;

import java.util.*;

/**
 * Collections工具类可以将集合变为不可变集合，
 * 包装后的不可变集合只可以访问，不可以再修改
 *
 * @author: Hussein Chen.
 * Data: 2018/2/2
 * Time: 0:40
 * E-mail: 43138199@qq.com
 */
public class CollectionsTest4 {
    public static void main(String[] args) {
        List unmodifiableList = Collections.emptyList();

        Set unmodifiableSet = Collections.singleton("廖银玥");

        Map unmodifiableMap = new HashMap<>();
        unmodifiableMap.put("老婆", "廖银玥");
        unmodifiableMap.put("媳妇", "玥玥");
        unmodifiableMap = Collections.unmodifiableMap(unmodifiableMap);

        /*输出集合即遍历集合，可以执行*/
        System.out.println(unmodifiableList);
        System.out.println(unmodifiableSet);
        System.out.println(unmodifiableMap);

        /*如下代码都将报异常-UnsupportedOperationException*/
        unmodifiableList.add("廖银玥");
        unmodifiableSet.add("玥玥");
        unmodifiableMap.put("女票", "银玥");
    }
}
