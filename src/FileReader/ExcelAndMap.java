package FileReader;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ExcelAndMap {
	public static void main(String[] args) throws IOException, IOException {
		String path = "DataDocs/testData.xlsx";
		FileInputStream fis = new FileInputStream(path);
//that helps us to read and write data
		XSSFWorkbook excel = new XSSFWorkbook(fis);
		
		Sheet sheet = excel.getSheet("Sheet1");
		int noOfRow = sheet.getPhysicalNumberOfRows();
		Row headerRow = sheet.getRow(0);
		
		
		
		ArrayList<LinkedHashMap<String,String>>excelData=new ArrayList<>();			///list that can store maps
	
		for (int i = 1; i < noOfRow; i++) {
			LinkedHashMap<String, String> rowMap = new LinkedHashMap<>();
			Row dataRow = sheet.getRow(i);//get a row from sheet one by one through loop
				int noOfCell = dataRow.getPhysicalNumberOfCells();
				for (int cellNo = 0; cellNo < noOfCell; cellNo++) {
					
					String key = headerRow.getCell(cellNo).toString();
					String value = dataRow.getCell(cellNo).toString();
					rowMap.put(key, value);
				}
				excelData.add(rowMap);
				
		}
		System.out.println(excelData.get(2));
	}
}

