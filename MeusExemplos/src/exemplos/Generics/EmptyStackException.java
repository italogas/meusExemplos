package exemplos.Generics;

/**
 * Exemplo da figura 18.9 Java Como Programar Ed6
 * @author Ítalo
 *
 */
public class EmptyStackException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmptyStackException() {
		this("Pilha esta vazia.");
	}

	public EmptyStackException(String arg0) {
		super(arg0);
	}

}
