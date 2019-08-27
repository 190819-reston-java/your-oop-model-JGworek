package myOOP;

import java.io.Serializable;

public class TunaSanwich extends Sandwich implements Refridgerator, Serializable {

	static String meat = "Tuna";
	static int temperature = 40;
	
	public TunaSanwich(String ingredients, String catchyName) {
		super(ingredients, catchyName);
	}

	public TunaSanwich(String ingredients) {
		super(ingredients);
	}

	public TunaSanwich() {
	}

	
	
	
	public void coolDown(int degrees) {
		System.out.println("You put the " + getCatchyName() + " in the refridgerator!");
		System.out.println("Your " + getCatchyName() + " went from " + temperature + " degrees to " + (temperature-degrees) + " degrees");

	}

	@Override
	public void eatSandwich() {
		System.out.println("Don't you love the taste of the sea!?");
	}
	
	
	@Override
	public void listIngredients(String...strings) {
		System.out.println("Your " + getCatchyName() + "Tuna Sandwhich's ingredients are: " + strings);

	}

	@Override
	public void sendBack() {
		System.out.println("The chef had to go fishing to make that!");

	}

}
