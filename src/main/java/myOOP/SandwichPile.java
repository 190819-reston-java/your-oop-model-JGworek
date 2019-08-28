package myOOP;

import java.util.ArrayList;
import java.util.Collection;

public class SandwichPile extends ArrayList<Sandwich> {

	public SandwichPile() {
		// TODO Auto-generated constructor stub
	}

	public SandwichPile(int initialCapacity) {
		super(initialCapacity);
		// TODO Auto-generated constructor stub
	}

	public SandwichPile(Collection<? extends Sandwich> c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	public void throwOut() {
		this.clear();
	}
}
