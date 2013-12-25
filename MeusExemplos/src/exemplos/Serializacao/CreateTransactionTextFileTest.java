package exemplos.Serializacao;

public class CreateTransactionTextFileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CreateTransactionTextFile file2 = new CreateTransactionTextFile();
		file2.openFile();
		file2.addTransactionRecord();
		file2.closeFile();

	}

}
