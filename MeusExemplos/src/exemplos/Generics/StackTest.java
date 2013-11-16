package exemplos.Generics;

/**
 * Exemplo da figura 18.10 Java Como Programar Ed6
 * @author Ítalo
 *
 */
public class StackTest {
	
	private double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
	private int[] intElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
	
	private Stack<Integer> integerStack;
	private Stack<Double> doubleStack;
	
	public void testStacks(){
		integerStack = new Stack<Integer>(10);
		doubleStack = new Stack<Double>(5);
		
		testPushDouble();
		testPopDouble();
		testPushInteger();
		testPopInteger();
		
	}

	private void testPopInteger() {
		try{
			System.out.println("\nRemovendo elementos em integerStack");
			int removedElement;
			
			while(true){
				removedElement = integerStack.pop();
				System.out.printf("%d ", removedElement);
			}
		} catch(EmptyStackException emptyStackException){
			System.err.println();
			emptyStackException.printStackTrace();
		}
		
	}

	private void testPushInteger() {
		try{
			System.out.println("\nInserindo elementos  em integerStack.");
			
			for(int element : intElements){
				System.out.printf("%d ", element);
				integerStack.push(element);
			}
			
		} catch (FullStackException fullStackException){
			System.err.println();
			fullStackException.printStackTrace();
		}
	}
		
	private void testPopDouble() {
		try{
			System.out.println("\nRemovendo elementos em doubleStack");
			double removedElement;
			
			while(true){
				removedElement = doubleStack.pop();
				System.out.printf("%.1f ", removedElement);
			}
		} catch(EmptyStackException emptyStackException){
			System.err.println();
			emptyStackException.printStackTrace();
		}
		
	}

	private void testPushDouble() {
		try{
			System.out.println("\nInserindo elementos  em doubleStack.");
			
			for(double element : doubleElements){
				System.out.printf("%.1f ", element);
				doubleStack.push(element);
			}
			
		} catch (FullStackException fullStackException){
			System.err.println();
			fullStackException.printStackTrace();
		}
	}

	public static void main(String args[]){
		StackTest application = new StackTest();
		application.testStacks();
		
	}
}
