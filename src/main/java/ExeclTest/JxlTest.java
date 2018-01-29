package ExeclTest;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import org.apache.log4j.Logger;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Author: Hussein Chen.
 * Data: 2017/10/15
 * Time: 19:30
 * E-mail: 43138199@qq.com
 */
public class JxlTest {

    private static final Logger logger = Logger.getLogger(JxlTest.class);
    private static final String DATE_FORMAT_PATTERN = "yyyyMMddHHmmss";

    public static void main(String[] args) {
        //定义文件名与文件路径
        String fileName = getFileName();
        String fileLoad = "D:/";

        //初始化输出流
        FileOutputStream fileOutputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedWriter bufferedWriter = null;

        //若文件已存在则删除
        File file = new File(fileLoad + fileName);
        if (file.exists()) {
            file.delete();
        }

        //获取文件的输出流
        try {
            fileOutputStream = new FileOutputStream(file,true);
            outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
            bufferedWriter = new BufferedWriter(outputStreamWriter);
        } catch (FileNotFoundException e) {
            logger.info(">>>>>>>>>>文件异常<<<<<<<<<<" + e);
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            logger.info(">>>>>>>>>>编码异常<<<<<<<<<<" + e);
            e.printStackTrace();
        }

        //读取源文件源文件，并获取文件中的值
        String filePath = "D:\\origin2.xls";
        List<String> strings = readXls(filePath);

        //写入目标文件
        try {
            writeXls(strings);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    /**
     * 创建文件名
     *
     * @Author HouZ
     * @return
     * 2017-10-13 下午3:58:53
     */
    public static String getFileName() {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        String dateStr = dateFormat(DATE_FORMAT_PATTERN, date);
        return "Hussein" + dateStr + ".xlsx";
    }

    /**
     * 日期格式化
     * @param format
     * @param date
     * @return
     */
    private static String dateFormat(String format, Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String dateStr = sdf.format(date);
        return dateStr;
    }
    /**
     * 读取execl文件
     *
     * @Author HouZ
     * @param filePath
     * @return
     * 2017-10-13 下午5:19:43
     */
    private static List<String> readXls(String filePath) {
        List<String> strings = new ArrayList<String>();
        File file = new File(filePath);
        FileInputStream fileInputStream;
        Workbook workbook = null;
        try {
            fileInputStream = new FileInputStream(file);
            workbook = Workbook.getWorkbook(fileInputStream);

            //获取execl中的第一张表
            Sheet sheet = workbook.getSheet(0);
            //获取第一张表的列数
            int columns = sheet.getColumns();
            //获取第一张表的行数
            int rows = sheet.getRows();
            System.out.println(rows);
            for (int j = 1; j < rows; j++) {
                Cell cell = sheet.getCell(0, j);
                System.out.println(cell.getContents());
                strings.add(cell.getContents());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return strings;
    }
    /**
     * 写入execl文件
     *
     * @Author HouZ
     * @param strings
     * @return
     * 2017-10-13 下午5:20:01
     */
    private static void writeXls(List<String> strings) throws IOException {
        String fileName = getFileName();
        String filePath = "D://";

        File file = new File(filePath + fileName);
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        //创建execl
        WritableWorkbook writableWorkbook = Workbook.createWorkbook(fileOutputStream);
        try {
            //创建工作薄，第一个参数为工作簿名称，第二个为页数
            WritableSheet writableSheet = writableWorkbook.createSheet("Test", 1);
            //向工作簿中传值
            for (int i = 0; i < strings.size(); i++) {
                //创建每个单元格的值，参数1为列数从0计算，参数2为行数从0计算，参数3为单元格内容
                Label label = new Label(0,i,strings.get(i));
                Label label2 = new Label(1,i,"Hussein Chen");
                writableSheet.addCell(label);
                writableSheet.addCell(label2);
            }

        writableWorkbook.write();
        writableWorkbook.close();
            System.out.println("成功！！！");
        } catch (RowsExceededException e) {
            e.printStackTrace();
        } catch (WriteException e) {
            e.printStackTrace();
        }
    }
}
