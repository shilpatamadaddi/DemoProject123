package Generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilities {
	
	public static String getCellData(String path,String sheetName,int row,int col)
	{
		String data=null;
		try
	   {
		FileInputStream f=new FileInputStream(path);
	    
		Workbook book = WorkbookFactory.create(f);
	   
	   data = book.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
	   
	   }
	
	 catch (Exception e) 
	   {
		System.out.println("unable to retrieve data");
	   }
	
	   return data; 
	}

}
