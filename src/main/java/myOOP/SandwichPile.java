package myOOP;

import java.util.ArrayList;
import java.util.Collection;

public class SandwichPile extends ArrayList<Sandwich> {

	public SandwichPile() {
	}

	public SandwichPile(int initialCapacity) {
		super(initialCapacity);
	}

	public SandwichPile(Collection<? extends Sandwich> c) {
		super(c);
	}

	public void throwOut() {
		System.out.println("You have thrown all of the sandwiches into the dumpster!");
		this.clear();
	}
	
	public void throwOut(int i) {
		System.out.println("You throw out " + i + " sandwiches into the dumpster!");
		try {
		this.removeRange(0, i);
		} catch(IndexOutOfBoundsException e) {
			System.out.println("There are not enough sandwiches in the pile to remove that many!");
		}
	}
}
