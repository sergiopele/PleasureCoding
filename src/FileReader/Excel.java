package FileReader;

import java.io.IOException;

public class Excel {
	public static void main(String[] args) throws IOException {
		System.out.print(ExcelReaderASMethod.read("DataDocs/testData.xlsx")+" ");
		
	}
}

