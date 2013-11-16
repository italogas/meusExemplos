package exemplos.Generics;

public class InvalidSubscriptException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidSubscriptException() {
		this("Subscript invalido. ");
	}

	public InvalidSubscriptException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
