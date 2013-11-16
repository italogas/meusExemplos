package exemplos.Generics;

/**
 * Exemplo da figura 18.5 Java Como Programar Ed6
 * @author Ítalo
 *
 */
public class MaximumTest {

	public static <T extends Comparable<T>> T maximum(T x, T y, T z){
		T max = x;
		
		if(y.compareTo(max) > 0)
			max = y;
		
		if(z.compareTo(max) > 0)
			max = z;
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.printf("O maximo de %d, %d e %d eh %d\n", 3, 4, 5, maximum(3, 4, 5));
		System.out.printf("O maximo de %.1f, %.1f e %.1f eh %.1f\n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));
		System.out.printf("O maximo de %s, %s e %s eh %s\n", "pear", "apple", "orange", maximum("pear", "apple", "orange"));
		System.out.println(System.getProperty("sun.arch.data.model"));
		System.out.println(System.getProperty("os.arch"));
	} // fim de main

} //fim da classe MaximumTest
