package exemplos.Serializacao;

public class FileMatchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        FileMatch fileMatch = new FileMatch();
        fileMatch.openReadFile();
        fileMatch.openWriteFile();
        fileMatch.computeRecords();
        fileMatch.closeReadFile();
        fileMatch.closeWriteFile();
	}

}
