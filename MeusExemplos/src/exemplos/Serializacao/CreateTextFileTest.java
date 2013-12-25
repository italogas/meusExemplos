package exemplos.Serializacao;

public class CreateTextFileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CreateTextFile file = new CreateTextFile();
		file.openFile();
		file.addRecords();
		file.closeFile();

	}

}
