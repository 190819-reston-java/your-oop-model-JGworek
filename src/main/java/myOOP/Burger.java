package myOOP;

import java.io.Serializable;

public class Burger extends Sandwich implements Microwave, Serializable {

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
		System.out.println("You put the " + getCatchyName() + " in the microwave!");
		System.out.println("Your " + getCatchyName() + " went from " + temperature + " degrees to " + (temperature+degrees) + " degrees");
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

}
