package COM.EXCEL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	@Test
	public void excel() throws IOException{
		File src= new File("D:\\Excel_data.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		String data=sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("data from excel is"+data);
		
		/*Row r=s.getRow(5);
		System.out.println(s.getLastRowNum());
		Cell c=r.getCell(6);
		System.out.println(r.getLastCellNum());
		System.out.println(c.getStringCellValue());
		System.out.println(wb.getSheet("Sheet1").getRow(6).getCell(6).getStringCellValue());*/
		wb.close();
		
		
		
	}

}
