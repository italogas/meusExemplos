package exemplos.Generics;

import java.util.ArrayList;

public class WildCardTest {
	
	public static void main(String[] args) {
		
		Integer[] integers = {1, 2, 3, 4, 5};
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		
		for(Integer element : integers)
			integerList.add(element);
		
		System.out.printf("\nElementos em integerList: %s ", integerList);
		System.out.printf("Soma: %.1f", sum(integerList));
		
		Double[] doubles = {1.1, 3.3, 5.5};
		ArrayList<Double> doubleList = new ArrayList<Double>();
		
		for(Double element : doubles)
			doubleList.add(element);
		
		System.out.printf("\nElementos em doubleList: %s ", doubleList);
		System.out.printf("Soma: %.1f", sum(doubleList));
		
		Number[] numbers = {1, 2.1, 3, 4.1};
		ArrayList<Number> numberList = new ArrayList<Number>();
		
		for(Number element : numbers)
			numberList.add(element);
		
		System.out.printf("\nElementos em numberList: %s ", numberList);
		System.out.printf("Soma: %.1f", sum(numberList));
	}

	private static double sum(ArrayList<? extends Number> numberList) {
		double total = 0;
		
		for(Number element : numberList)
			total += element.doubleValue();
		
		return total;
	}

}
