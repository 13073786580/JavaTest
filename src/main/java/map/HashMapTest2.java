package map;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author: Hussein Chen.
 * Data: 2018/1/24
 * Time: 23:58
 * E-mail: 43138199@qq.com
 */
public class HashMapTest2 {
    public static void main(String[] args) {
        HashMap hm = new HashMap(16);
        hm.put(new A(999), "廖银玥");
        hm.put(new A(888), "玥玥");
        System.out.println(hm);

        Iterator iterator = hm.keySet().iterator();
        A first = (A) iterator.next();
        first.count = 888;
        System.out.println(hm);

        hm.remove(new A(888));
        System.out.println(hm);

        System.out.println(hm.get(new A(999)));
        System.out.println(hm.get(new A(888)));

    }

    static class A {

        int count;

        public A(int count){
            this.count = count;
        }

        @Override
        public int hashCode() {
            return this.count;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == A.class) {
                A a = (A)obj;
                return this.count == a.count;
            }
            return false;
        }
    }
}
