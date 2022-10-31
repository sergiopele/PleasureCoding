package encodeLetters;

class Encode {
	int offset;
	String word;
	
	Encode(int offset, String word) {
		this.offset = offset;
		this.word = word;
	}
	
	String encoder() {
		String result = "";
		for (int i = 0; word.length() > i; i++) {
			int index = word.charAt(i);
			result += (char) (index + offset);
		}
		return result;
	}
	
	String decoder(String wordToDecode) {
		String result = "";
		for (int i = 0; i < wordToDecode.length(); i++) {
			int index = wordToDecode.charAt(i);
			result += (char) (index - offset);
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		Encode e = new Encode(2, "astronaut");
		System.out.println("This is encoder " + "\t" + e.encoder());
		String wordForDecode = e.encoder();
		System.out.println("This is decoder " + "\t" + e.decoder(wordForDecode));
	}
}
