package Set;
/*
Create a Card class that will have implemented  and unimplemented methods and a constructor that will initializes credit card type.
Create 3 subclasses of a Card card. Create 3 objects of different card and store them into LinkedList.
Using for loop/advanced for loop/ iterator access all methods of the class.
 */

import java.util.LinkedList;

public class CardHW {
	public static void main(String[] args) {
		LinkedList<Card> card=new LinkedList<>();
		card.add(new MasterCard("Master Card"));
		card.add(new Visa("Visa Card"));
		card.add(new UnknownCard("Unknown Card"));
		
		for (Card cards:card
			 ) {
			cards.display();
			cards.implementedMethod();
		}
		
	}
}

abstract class Card {
	String creditCardType;
	
	Card(String creditCardType) {
		this.creditCardType = creditCardType;
	}
	
	abstract void display();
	
	void implementedMethod() {
		System.out.println("u reach implemented Card (parent) method");
	}
}

class MasterCard extends Card {
	MasterCard(String creditCardType) {
		super(creditCardType);
	}
	
	@Override
	void display() {
		System.out.println("here u see " + creditCardType + " display method");
	}
	
}

class Visa extends Card {
	Visa(String creditCardType) {
		super(creditCardType);
	}
	
	@Override
	void display() {
		System.out.println("u right it is " + creditCardType + " display method");
	}
}

class UnknownCard extends Card {
	
	UnknownCard(String creditCardType) {
		super(creditCardType);
	}
	
	@Override
	void display() {
		System.out.println("this is " + creditCardType + " display method");
	}
}
