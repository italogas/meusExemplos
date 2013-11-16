package exemplos.Generics;

public class FindBugsTest {
	
	public static void imprimeString(String str){
		if(str != null){
			System.out.println(str);
		}
		
		System.out.println(str.toUpperCase());
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a = "Italo";
		imprimeString(a);
	}

}

  
