package exemplos.Generics;

/**
 * Exemplo da figura 18.11 Java Como Programar Ed6
 * @author Ítalo
 *
 */
public class StackTest2 {
	
	private Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
	private Integer[] intElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
	
	private Stack<Integer> integerStack;
	private Stack<Double> doubleStack;
	
	public void testStacks(){
		integerStack = new Stack<Integer>(10);
		doubleStack = new Stack<Double>(5);
		
		testPush("doubleStack", doubleStack, doubleElements);
		testPop("doubleStack", doubleStack);
		testPush("integerStack", integerStack, intElements);
		testPop("integerStack", integerStack);
		
	}

	private <E> void testPop(String nome, Stack<E> stack) {
		try{
			System.out.printf("\nRemovendo elementos em %s ", nome);
			E removedElement;
			
			while(true){
				removedElement = stack.pop();
				System.out.printf("%s ", removedElement);
			}
		} catch(EmptyStackException emptyStackException){
			System.err.println();
			emptyStackException.printStackTrace();
		}
		
	}

	private <E> void testPush(String nome, Stack<E> stack, E[] elements) {
		try{
			System.out.printf("\nInserindo elementos em %s. ", nome);
			
			for(E element : elements){
				System.out.printf("%s ", element);
				stack.push(element);
			}
			
		} catch (FullStackException fullStackException){
			System.err.println();
			fullStackException.printStackTrace();
		}
	}

	public static void main(String[] args) {
		StackTest2 application = new StackTest2();
		application.testStacks();

	}

}
