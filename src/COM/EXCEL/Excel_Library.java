package COM.EXCEL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Library {
	
	public static String getCellValue(String path,String sheet,int r,int c) throws IOException
	{
		File src= new File("D:\\Excel_data.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String data=sheet1.getRow(r).getCell(c).toString();
		return data;
		
	}
	

}
