package map;

import java.util.Hashtable;

/**
 * @author: Hussein Chen.
 * Data: 2018/1/24
 * Time: 23:37
 * E-mail: 43138199@qq.com
 */
public class HashtableTest1 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(new A(999), "廖银玥");
        ht.put(new A(888), "玥玥");
        ht.put(new A(777), new B());
        System.out.println(ht);

        /*HashMap和Hashtable判断value相等的时候只有一个条件即equals方法返回为true，
        * 那么HashMap就判断值相等，由于我们重写了B方法使其equals方法永远返回true，
        * 所以去查找是否包含值为我老婆的value时，value为B的和其比较equals总是返回true，
        * 故map判断存在value为我老婆的value*/
        System.out.println(ht.containsValue("我老婆"));

        /*由于A得到equals方法判断count值相等即返回true，且hashcode方法返回的值也为count，
        * 故虽然这明显是两个对象，但其hashcode和equals方法返回true，
        * 所以map判断存在count为999的key*/
        System.out.println(ht.containsKey(new A(999)));

        System.out.println(ht);
        System.out.println(ht.remove(new A(888)));
        System.out.println(ht);
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

    static class B {

        public B(){

        }

        @Override
        public boolean equals(Object obj) {
            return true;
        }
    }

}
