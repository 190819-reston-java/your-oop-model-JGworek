package myOOP;

import java.io.Serializable;

public class Burger extends Sandwich implements Microwave, Serializable, Comparable<Burger> {

	static String meat = "ground beef";
	static int temperature = 70;
	
	public Burger(String ingredients, String catchyName) {
		super(ingredients, catchyName);
	}

	public Burger(String ingredients) {
		super(ingredients);
	}

	public Burger() {
	}

	public void heatUp(int degrees) {
		if(degrees < 0) {
			throw new NegativeHeatException();
		}
		System.out.println("You put the " + getCatchyName() + " in the microwave!");
		System.out.println("Your " + getCatchyName() + " went from " + temperature + " degrees to " + (temperature+degrees) + " degrees");
	}
	
	public void putInMicrowave(int degrees) {
		try {
			heatUp(degrees);
		} catch (NegativeHeatException e) {
			System.out.println("How do you heat up something negative degrees!?");
			System.out.println("Your Burger will just get cold!");
		}
	}
	
	@Override
	public void eatSandwich() {
		System.out.println("Only three cows were murdered in the making of this sandwhich.");
	}

	@Override
	public void listIngredients() {
		System.out.println("Your " + getCatchyName() + "-Burger's ingredients are: " + getIngredients().toLowerCase() + ", and " + meat);

	}

	@Override
	public void sendBack() {
		System.out.println("The chef had to kill a whole cow for that!");

	}

	public int compareTo(Burger o) {
		String ourCatchyName = this.getCatchyName();
		String otherCatchyName = o.getCatchyName();
		char ourFirstChar = ourCatchyName.charAt(0);
		char otherFirstChar = otherCatchyName.charAt(0);
		int out = ourFirstChar - otherFirstChar;
		return out;
	}
}
