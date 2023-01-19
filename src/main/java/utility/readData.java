package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readData {

public static  String readProperty(String value) throws Exception
{
Properties shiv= new Properties();
FileInputStream file = new FileInputStream("C:\\Users\\sanjivani\\eclipse-workspace\\New Eclipse Workspace\\FrameWorkProject\\TestData\\conflig.Properties");
shiv.load(file);
Thread.sleep(2000);
return shiv.getProperty(value);
}

public static String readExel(int row, int col) throws Exception
{
	FileInputStream file = new FileInputStream("C:\\Users\\sanjivani\\eclipse-workspace\\New Eclipse Workspace\\FrameWorkProject\\TestData\\shivexel.xlsx");
    Sheet exel = WorkbookFactory.create(file).getSheet("Sheet1");
    String shivani = exel.getRow(row).getCell(col).getStringCellValue();
            return shivani;   
    
}}
	


