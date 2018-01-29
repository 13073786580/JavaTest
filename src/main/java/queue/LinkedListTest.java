package queue;

import java.util.LinkedList;

/**
 * @author: Hussein Chen.
 * Data: 2018/1/19
 * Time: 0:29
 * E-mail: 43138199@qq.com
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList language = new LinkedList();
        /*队列的方法，添加到队列的尾部*/
        language.offer("JAVA");
        /*栈的方法，添加到栈顶*/
        language.push("PYTHON");
        /*队列的方法，添加到队列头*/
        language.offerFirst("C++");

        for (int i = 0; i < language.size(); i++) {
            System.out.println(language.get(i));
        }
        System.out.println("===============");
        /*访问并不删除栈顶元素*/
        System.out.println(language.peekFirst());
        /*访问并不删除队列尾元素*/
        System.out.println(language.peekLast());
        /*将栈顶的元素弹出栈*/
        System.out.println(language.pop());

        System.out.println(language);

        /*将队列的第一个元素弹出*/
        /*System.out.println(language.poll());*/

        /*访问并删除队列的最后一个元素*/
        System.out.println(language.pollLast());

        System.out.println(language);
    }
}
