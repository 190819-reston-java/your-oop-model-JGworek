package myOOP;

public class NegativeCoolException extends RuntimeException {

	public NegativeCoolException() {
		this("You cannot cool negative degrees!");
	}

	public NegativeCoolException(String message) {
		super(message);
	}

}
