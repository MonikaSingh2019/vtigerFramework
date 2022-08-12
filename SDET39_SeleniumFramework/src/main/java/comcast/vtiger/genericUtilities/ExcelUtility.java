package comcast.vtiger.genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
/**
 * This method is used fetch data from Excelsheet
 * @author Monika
 */
	public String getDataFromExcel(String sheetName,int RowNum,int celNum) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./Data/Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(RowNum);
		Cell cell= row.getCell(celNum);
		String data = cell.getStringCellValue();
		return data;
		
		//DataFormatter format = new DataFormatter();
		//return format.formatCellValue(book.getSheet(sheetName).getRow(RowNum).getCell(celNum));
	}
}
