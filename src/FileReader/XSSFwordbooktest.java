package FileReader;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;


public class XSSFwordbooktest {
	public static void main(String[] args) throws IOException {
		String path = "/Users/sergiopele/IdeaProjects/hw/DataDocs/Test case 1.xlsx";
		FileInputStream fileInputStream = new FileInputStream(path);
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = xssfWorkbook.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		System.out.println(row.getCell(1));
		fileInputStream.close();
	}
}
