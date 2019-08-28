package myOOP;

import java.lang.ref.Reference;

public abstract class Sandwich {

	private String ingredients;
	private String catchyName;
	private int bitesTaken;
	private int temperature;
	
	
	public Sandwich(String ingredients, String catchyName) {
		super();
		this.ingredients = ingredients;
		this.catchyName = catchyName;
	}
	
	public Sandwich(String ingredients) {
		this(ingredients, "The Chef's Surprise");
	}
	
	public Sandwich() {
		this("Whatever was in the fridge");
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getCatchyName() {
		return catchyName;
	}

	public void setCatchyName(String catchyName) {
		this.catchyName = catchyName;
	}

	public int getBitesTaken() {
		return bitesTaken;
	}

	public void setBitesTaken(int bitesTaken) {
		this.bitesTaken = bitesTaken;
	}
	
	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public void eatSandwich() {
		System.out.println("What a delicious meal");
	}
	
	public abstract void listIngredients();
	
	public abstract void sendBack();

	@Override
	public String toString() {
		return "Sandwich [ingredients=" + ingredients + ", catchyName=" + catchyName + "]";
	}
	
	
	
}
