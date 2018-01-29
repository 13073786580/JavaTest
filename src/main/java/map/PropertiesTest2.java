package map;

import java.io.*;
import java.util.Properties;

/**
 * @author: Hussein Chen.
 * Data: 2018/1/26
 * Time: 0:25
 * E-mail: 43138199@qq.com
 */
public class PropertiesTest2 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        FileInputStream fileInputStream = null;
        InputStreamReader inputStreamReader = null;
        File file = null;

        prop.put("宝宝", "玥");
        file = new File("C:\\Users\\43138\\Documents\\desktop.ini");
        try {
            fileInputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(fileInputStream, "UTF-16");
            prop.load(inputStreamReader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(prop);
        }

    }
}
