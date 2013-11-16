package exemplos.Generics;

/**
 * Exemplo da figura 18.7 Java Como Programar Ed6
 * @author Ítalo
 *
 * @param <E>
 */
public class Stack<E> {
	
	private final int size; // numero de elementos na pilha
	private int top; // guarda topo da pilha
	private E[] elements; // array que armazena elementos da pilha
	
	// cria pilha padrão
	public Stack(){
		this(10);
	}
	
	@SuppressWarnings("unchecked")
	public Stack(int s) {
		size = s > 0 ? s : 10;
		top = -1;
		
		elements = (E[]) new Object[size];
	}
	
	public void push(E element){
		if(top == size-1)
			throw new FullStackException(String.format("Pilha esta cheia. Falha ao inserir elemento: %s", element));
		
		elements[++top] = element;
	}
	
	public E pop(){
		if(top == -1)
			throw new EmptyStackException("Pilha esta vazia. Impossivel extrair.");
		
		return elements[top--];
		
	}

}
