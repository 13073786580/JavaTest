package runtimeTest;

import java.io.IOException;

/**
 * Author：Edison Hou.
 * Date：2017/6/12 22:44
 * phone:17621373690
 */
public class RuntimeTest2 {
    public static void main(String[] args) {
        /*Runtime类还可以做到启动一个进程，
        * 来运行操作系统的命令*/
        Runtime runtime = Runtime.getRuntime();
        /*运行记事本程序*/
        try {
            runtime.exec("notepad.exe");
        } catch (IOException e) {
            e.getMessage();
            e.toString();
        }
    }
}
