package hwrks;

abstract class File {
	abstract void open();
	
	void edit() {
		System.out.println("Edit file");
	}
	
	void close() {
		System.out.println("close file");
	}
	
	public static void main(String[] args) {
		File[] f = {new JavaFile(), new PdfFile(), new WordFile()};
		for (File i : f) {
			i.open();
		}
	}
}

class JavaFile extends File {
	
	@Override
	void open() {
		System.out.println("to open .java file we need notepad++");
	}
}

class WordFile extends File {
	
	@Override
	void open() {
		System.out.println("to open .doc file we need Microsoft word to be installed ");
		
	}
}

class PdfFile extends File {
	
	
	@Override
	void open() {
		System.out.println("to open Pdf file we need adobe reader");
		
	}
}
