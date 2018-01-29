package ExeclTest;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import static ExeclTest.JxlTest.getFileName;

/**
 * Author: Hussein Chen.
 * Data: 2017/10/15
 * Time: 22:08
 * E-mail: 43138199@qq.com
 */
public class PoiTest {
    public static void main(String[] args) {
        List<String> strings = readExecl("D:\\origin2.xls");
        writeExecl(strings);
    }

    /**
     * 使用POI读取EXECL文件内容
     * @param filePath
     */
    public static List<String> readExecl(String filePath) {
        List<String> strings = new ArrayList<String>();
        File file = new File(filePath);
        try {
            InputStream inputStream = new FileInputStream(filePath);
            //判断文件格式
            String ext = filePath.substring(filePath.indexOf('.'));
            Workbook workbook = null;
            if (".xls".equals(ext)){
                workbook = new HSSFWorkbook(inputStream);
            } else {
                workbook = new XSSFWorkbook(inputStream);
            }
            Sheet sheet = workbook.getSheetAt(0);
            int rowNum = sheet.getLastRowNum();
            for (int i = 0; i < rowNum + 1; i++) {
                Row row = sheet.getRow(i);
                Cell cell = row.getCell(0);
                switch (cell.getCellType()){
                    case Cell.CELL_TYPE_STRING:
                        strings.add(cell.getStringCellValue());
                        break;
                    //当数值长度过长时会变为科学计数法
                    case Cell.CELL_TYPE_NUMERIC:
                        DecimalFormat decimalFormat = new DecimalFormat("0");
                        double cellDouble = cell.getNumericCellValue();
                        String cellValue = decimalFormat.format(cellDouble);
                        strings.add(cellValue);
                        break;
                    default:
                        System.out.println("can not recognize this cell's type!");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

    /**
     * 写入文件
     * @param strings
     */
    public static void writeExecl(List<String> strings) {
        String filePath = "D://";
        String fileName = getFileName();
        File file = new File(filePath + fileName);
        if (file.exists()){
            file.delete();
        }

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            //XSSFWorkbool为Execl2010版本，HSSFWorkbook为execl2007版本
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
            Sheet sheet = xssfWorkbook.createSheet("Test");
            for (int i = 0; i < strings.size(); i++) {
                Row row = sheet.createRow(i);
                XSSFCell cell = (XSSFCell) row.createCell(0);//只写入第一列
                cell.setCellType(XSSFCell.CELL_TYPE_STRING);
                cell.setCellValue(strings.get(i));
            }
            xssfWorkbook.write(fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            System.out.println("成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
