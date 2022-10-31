package time;

import java.util.Date;

public class time2 {
	public static void main(String[] args) {
		Date time = new Date();
		long hours = time.getHours();
		long minutes = time.getMinutes();
		//long a = 3_000_000_000L;
		
		String str_Sample = "RockStar";
		System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));
		
		System.out.println(hours+":"+minutes);
	}
}
