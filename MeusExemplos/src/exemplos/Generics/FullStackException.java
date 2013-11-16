package exemplos.Generics;

/**
 * Exemplo da figura 18.8 Java Como Programar Ed6
 * @author Ítalo
 *
 */
public class FullStackException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FullStackException(){
		this("Pilha esta cheia.");
	}
	
	public FullStackException(String arg0){
		super(arg0);
	}

}
