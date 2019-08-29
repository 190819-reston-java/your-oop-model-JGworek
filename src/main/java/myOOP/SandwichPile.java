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
}
