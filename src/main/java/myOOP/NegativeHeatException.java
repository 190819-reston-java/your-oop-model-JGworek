package myOOP;

public class NegativeHeatException extends RuntimeException {

	public NegativeHeatException() {
		this("You cannot heat negative degrees!");
	}

	public NegativeHeatException(String message) {
		super(message);
	}

}
