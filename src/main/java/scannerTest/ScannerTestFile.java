package scannerTest;

import java.io.*;
import java.util.Scanner;

/**
 * Author：Edison Hou.
 * Date：2017/6/11 21:28
 * phone:17621373690
 */
public class ScannerTestFile {
    public static void main(String[] args) {
        try {
            //乱码问题，并未解决
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("F:\\书\\告白.txt"),"UTF-8"));
            Scanner scanner = new Scanner(bufferedReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.toString();
        } catch (UnsupportedEncodingException e) {
            e.getMessage();
        }
    }
}
