package FileReader;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo {
	public static void main(String[] args) throws IOException {
		String path ="DataDocs/testData.xlsx";				//declare path of file
		var fileinputStream = new FileInputStream(path);		//navigate to the path
		
		var xssfWorkbook = new XSSFWorkbook(fileinputStream);		// takes raw file and convert it to human readable information
		Sheet sheet = xssfWorkbook.getSheet("Sheet1");
		
		//getting the information from the file (starts with 0)
		/*Row rowO = sheet.getRow(0);			//row
		System.out.println(rowO.getCell(2));		//column
		Row row1 = sheet.getRow(2);
		System.out.println(row1.getCell(2));
		*/
		
		int rows= sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < rows; i++) {
			Row row = sheet.getRow(i);
			int columns = row.getPhysicalNumberOfCells();
			for (int j = 0; j < columns; j++) {
				Cell cell = row.getCell(j);
				System.out.print(cell+" ");
				
			}
			System.out.println();
		}
	}
}
