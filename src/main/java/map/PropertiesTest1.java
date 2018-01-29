package map;

import java.io.*;
import java.util.Properties;

/**
 * Properties类是Hashtable类的子类
 * 本例展示通过Properties类输出为配置文件
 *
 * @author: Hussein Chen.
 * Data: 2018/1/25
 * Time: 23:53
 * E-mail: 43138199@qq.com
 */
public class PropertiesTest1 {
    public static void main(String[] args) {
        //初始化变量
        Properties prop = new Properties();
        FileOutputStream fileOutputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        File file = null;
        //添加配置
        prop.put("老婆", "廖银玥");
        prop.put("媳妇", "银玥");
        prop.put("女朋友", "玥玥");
        //创建文件位置并先删除文件
        file = new File("C:\\Users\\43138\\Documents\\customer.ini");
        if (file.exists()) {
            file.delete();
        }
        try {
            fileOutputStream = new FileOutputStream(file);
            outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
            /* 1.直接采用fileOutputStream会造成输出的配置文件为乱码，需采用OutputStreamWriter确定其编码
            *  2.第二个参数为首行的注释，不可为中文因无法设置其编码，若需换行可以在其中插入\n*/
            prop.store(outputStreamWriter, "Just the first line of annotation \n@Auther Hussein Chen");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStreamWriter != null) {
                    outputStreamWriter.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
