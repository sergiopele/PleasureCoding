package qq;

class Main {
	String alphabetical(String str){
		String result="";
		char letter ='a';
		char letter2='a';
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>=letter){
				letter=str.charAt(i);
				result+=letter;
			}else if(str.charAt(i)==letter2){
				letter=str.charAt(i);
			}
		}return result;
	}
		
		
		public static void main (String [] args){
			Main m = new Main();
			System.out.println(m.alphabetical("hello"));
			System.out.println(m.alphabetical("software"));
			System.out.println(m.alphabetical("language"));
			
		}
	}
