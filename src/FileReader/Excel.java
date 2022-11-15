package FileReader;

import java.io.IOException;

public class Excel {
	public static void main(String[] args) throws IOException {
		System.out.print(ExcelReader.read("DataDocs/testData.xlsx"));
		
	}
}

