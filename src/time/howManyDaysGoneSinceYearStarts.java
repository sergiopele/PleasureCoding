package time;

import java.util.Date;

public class howManyDaysGoneSinceYearStarts {
	public static void main(String[] args) {
		
		Date startYear = new Date();
		startYear.setHours(0);
		startYear.setHours(0);
		startYear.setSeconds(0);
		
		startYear.setDate(1);
		startYear.setMonth(0);
		
		Date currentTime = new Date();
		
		long msTimeDifference = currentTime.getTime()-startYear.getTime();
		long msInDay=24*60*60*1000;
		
		int result =(int)(msTimeDifference/msInDay);
		System.out.println("Days since year starts "+result);
	}
}
