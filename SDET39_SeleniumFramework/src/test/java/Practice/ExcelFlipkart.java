package Practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelFlipkart {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("./Data/Excel.xlsx");
		Workbook wb =WorkbookFactory.create(fis);
		Sheet sh =wb.getSheet("Sheet1");
		Row row = sh.getRow(3);
		Cell cell =row.getCell(0);
		String cellValue = cell.getStringCellValue();
		System.out.println(cellValue);
		
	}

}
