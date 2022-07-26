package com.ng;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EXcelTest {

	@org.testng.annotations.Test
	public void Test() throws IOException 
	{
		XSSFWorkbook book=new XSSFWorkbook(".//excel//TestDipal.xlsx");
		XSSFSheet Sheet= book.getSheetAt(0);//selecting sheet from excel
		int rowCount=Sheet.getLastRowNum(); // Getting rows data from sheet of excel
		int columnCount=Sheet.getRow(1).getLastCellNum();// getting Column from sheet
		
		for(int i=1;i<=rowCount; i++)
		{
			XSSFRow row=Sheet.getRow(i);
			for(int j=0;j<=columnCount ;j++)
			{
				try {
				String cellValue=row.getCell(j).getStringCellValue();
				System.out.println(cellValue);
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
