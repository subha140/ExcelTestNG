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

public class ReadExcel1 {
	
	@Test
	public void excel() throws IOException{
		File src= new File("D:\\Excel_data.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		int rowcount=sheet1.getLastRowNum();
		System.out.println("total row is:"+rowcount+1);
		for(int i=0; i<=rowcount;i++)
		{
			String data=sheet1.getRow(i).getCell(0).getStringCellValue();
		    //System.out.println("test data from excel is:"+data);
		    System.out.println("datafrom row"+i+"is"+data);
		}
		
		
		
		
		
		wb.close();
		
		
		
	}

}
