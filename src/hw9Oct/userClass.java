package hw9Oct;

public class userClass {
	
	String name;
	long mobNumber;
	String address;
	
	userClass(String name, long mobNumber) {
		this.name = name;
		this.mobNumber = mobNumber;
	}
	
	void userDetails() {
		
		System.out.println("name " + name + " mobNumber " + mobNumber + " address " + address);
		
	}
	
	public static void main(String[] args) {
		userClass user = new userClass("Andreas", 324_456_678);
		user.userDetails();
		userInfo user2 = new userInfo("Josh", 456_654_321, "Woodstate Rd");
		user2.userDetails();
	}
}

class userInfo extends userClass {
	userInfo(String name, long mobNumber, String address) {
		super(name, mobNumber);
		this.address = address;
	}
	
}
