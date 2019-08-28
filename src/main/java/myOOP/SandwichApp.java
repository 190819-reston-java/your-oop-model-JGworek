package myOOP;

import java.util.ArrayList;
import java.util.List;

public class SandwichApp {

	public static void main(String[] args) {

		Burger yum = new Burger("cheese" , "Burger with Cheese");
		yum.heatUp(10);
		yum.listIngredients();
		Burger burger1 = new Burger("cheese", "The cheeseman");
		TunaSanwich tuna1 = new TunaSanwich("cheese", "The cheesewoman");
		Sandwich carlosDefault = new Burger();
		
		
		List<Sandwich> pileOfSandwiches = new SandwichPile();
		pileOfSandwiches.add(burger1);
		pileOfSandwiches.add(tuna1);
		pileOfSandwiches.add(carlosDefault);
		
		System.out.println("There are " + pileOfSandwiches.size() + " sandwiches in the pile");
		if (pileOfSandwiches.size() > 5) {
			System.out.println("That is too many sandwiches for any mere mortal.");
		} else {
			System.out.println("You should eat them all before they spoil.");
		}
		
		System.out.println(pileOfSandwiches);
	
		((SandwichPile) pileOfSandwiches).throwOut();
		
		System.out.println("There are now " + pileOfSandwiches.size() + " sandwiches in the pile");
	}

}
