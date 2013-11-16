package exemplos.Generics;

public class GenericMethodTest {
	
	public static <E> void imprimeArray(E[] array){
		for(E element : array)
			System.out.printf("%s ", element);
		
		System.out.println();
		
	}
	
	public static <E> void imprimeArray(E[] array, int lowSubscript, int highSubscript){
		if(lowSubscript < 0 || lowSubscript > highSubscript)
			throw new InvalidSubscriptException(String.format("lowSusbscript invalido: %d", lowSubscript ));
		if(highSubscript < 0 || highSubscript > array.length-1)
			throw new InvalidSubscriptException(String.format("highSusbscript invalido: %d", highSubscript ));
		
		for(int i = lowSubscript; i <= highSubscript; i++)
			System.out.printf("%s ", array[i]);
		
		System.out.println();
		
	}

	public static void main(String[] args) {
		Integer[] integerArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
		Character[] characterArray = {'O', 'L', 'A'};
		
		System.out.println("integerArray: ");
		imprimeArray(integerArray);
		System.out.println("doubleArray: ");
		imprimeArray(doubleArray);
		System.out.println("characterArray: ");
		imprimeArray(characterArray);
		
		try{
			System.out.println("\nintegerArray limitado em intervalo invalido: ");
			imprimeArray(integerArray, -1, 3);
		} catch(InvalidSubscriptException invalidSubscriptException){
			System.err.println();
			invalidSubscriptException.printStackTrace();
		}
		
		try{
			System.out.println("\ndoubleArray limitado em intervalo invalido: ");
			imprimeArray(doubleArray, 0, 5);
		} catch(InvalidSubscriptException invalidSubscriptException){
			System.err.println();
			invalidSubscriptException.printStackTrace();
		}
		
		try{
			System.out.println("\ncharacterArray limitado em intervalo invalido: ");
			imprimeArray(characterArray, 0, 10);
		} catch(InvalidSubscriptException invalidSubscriptException){
			System.err.println();
			invalidSubscriptException.printStackTrace();
		}

		
		System.out.println("\nintegerArray limitado corretamente: ");
		imprimeArray(integerArray, 0, 2);
		System.out.println("\ndoubleArray limitado corretamente: ");
		imprimeArray(doubleArray, 2, 4);
		System.out.println("\ncharacterArray limitado corretamente: ");
		imprimeArray(characterArray, 2, 2);
	}

}
