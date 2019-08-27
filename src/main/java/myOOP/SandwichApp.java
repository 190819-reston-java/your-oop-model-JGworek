package myOOP;

public class SandwichApp {

	public static void main(String[] args) {

		Burger yum = new Burger("cheese" , "Burger with Cheese");
		yum.heatUp(10);
		yum.listIngredients();
	}

}
