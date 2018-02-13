package thread;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: Hussein Chen.
 * Data: 2018/2/18
 * Time: 0:22
 * E-mail: 43138199@qq.com
 */
public class SynchronizedCollections {
    public static void main(String[] args) {
        HashMap map = (HashMap) Collections.synchronizedMap(new HashMap(16));

        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16,6,8);
    }
}
