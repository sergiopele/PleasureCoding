package hwerk;

public class CreditCard {
	double balance, interest;
	double result;
	
	CreditCard(double balance, double interest) {
		this.balance = balance;
		this.interest = interest;
	}
	
	void setInterest() {
		System.out.println(result = (interest / 12) * balance);
	}
}

class Visa extends CreditCard {
	Visa(double balance, double interest) {
		super(balance, interest);
	}
	
	public static void main(String[] args) {
		CreditCard c = new CreditCard(5000, 0.05);
		c.setInterest();
		Visa v = new Visa(4000, 0.04);
		v.setInterest();
		AX a = new AX(7000, 0.06);
		a.setInterest();
	}
}

class AX extends CreditCard {
	AX(double balance, double interest) {
		super(balance, interest);
	}
	
	@Override
	void setInterest() {
		System.out.println(result = (interest / 12) * balance);}
}