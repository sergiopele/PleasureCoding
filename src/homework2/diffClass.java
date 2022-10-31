package homework2;

public class diffClass {
	public static void main(String[] args) {
		fourConstructors john = new fourConstructors(" john ", " jogh smith ", " USA ", " NY ");
		john.publicPrinter();
		john.defaultPrinter();
		john.protectedPrinter();
		
		fourConstructors lesia = new fourConstructors(" Lesia ", " lesia vali ", " Zinzibar ", " Zinz ");
		lesia.publicPrinter();
		lesia.defaultPrinter();
		lesia.protectedPrinter();
	}
}
