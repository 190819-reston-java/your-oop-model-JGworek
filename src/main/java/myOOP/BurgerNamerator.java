package myOOP;

import java.util.Comparator;

public class BurgerNamerator implements Comparator<Burger> {


	public int compare(Burger o1, Burger o2) {
		String burgerOneCatchyName = o1.getCatchyName();
		String burgerTwoCatchyName = o2.getCatchyName();
		return burgerOneCatchyName.compareTo(burgerTwoCatchyName);
	}
}
